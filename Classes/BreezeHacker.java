import java.util.Random;
public class BreezeHacker extends Criatura{

    private Random aleatorio = new Random();

    public BreezeHacker() {
        setVida(aleatorio.nextInt((400-200) + 1) + 200);
        setPoder(aleatorio.nextInt((30 - 10) + 1) + 10);
        setAtaque(aleatorio.nextInt((15 - 5) + 1) + 5);
        setDefesa(aleatorio.nextInt((15 - 5) + 1) + 5);
        setVelocidade(aleatorio.nextInt((10 - 1) + 1) + 1);
        setTipoCriatura(TipoCriatura.Ar);
    }

    @Override

    public void ataqueElemental(Criatura inimigo) {
        System.out.println("\n" + getTipoCriatura());
        System.out.println("Ataque de Ar!");

        if (inimigo.getTipoCriatura() == TipoCriatura.Terra) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 2));
            inimigo.receberDano(dano);
            posAtaque(dano, inimigo);

        } else if (inimigo.getTipoCriatura() == TipoCriatura.Agua) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 1));
            inimigo.receberDano(dano);
            posAtaque(dano, inimigo);

        } else if (inimigo.getTipoCriatura() == TipoCriatura.Fogo) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 1));
            inimigo.receberDano(dano);
            posAtaque(dano, inimigo);

        } else if (inimigo.getTipoCriatura() == TipoCriatura.Ar) {
            int dano = (int) ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 0.5));
            inimigo.receberDano(dano);
            posAtaque(dano, inimigo);
        }

        
    }
    
}
