public class BurnCoder extends Criatura {
  
    public BurnCoder(String nomeCriatura, String tipoCriatura) {
        this.setNomeCriatura(getNomeCriatura());
        this.setTipoCriatura(getTipoCriatura());
    }

  @Override
  public void ataqueElemental(Criatura oponente) {
    System.out.println("Ataque elementar!");
  }
  @Override
  public void ataqueNormal(Criatura oponente){
    int dano = getPoder() * getAtaque() / oponente.getDefesa();
    int vidaAtual = oponente.getVida() - dano;
    oponente.setVida(vidaAtual);
}
  @Override
  public String toString() {
      return getNomeCriatura() +
              "poder=" + getPoder() + ", ataque=" + getAtaque() +
              ", defesa=" + getDefesa() + ", velocidade=" + getVelocidade() +
              ", pontosVida=" + getVida();
  }
}