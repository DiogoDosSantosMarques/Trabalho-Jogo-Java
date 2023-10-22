import java.util.Random;
public class BreezeHacker extends Criatura{

    private Random aleatorio = new Random();

    public BreezeHacker(String nomeCriatura, String tipoCriatura) {

        super(nomeCriatura, tipoCriatura);

        setVida(aleatorio.nextInt((400-200) + 1) + 200);
        setPoder(aleatorio.nextInt((30 - 10) + 1) + 10);
        setAtaque(aleatorio.nextInt((15 - 5) + 1) + 5);
        setDefesa(aleatorio.nextInt((15 - 5) + 1) + 5);
        setVelocidade(aleatorio.nextInt((10 - 1) + 1) + 1);
        
    }

    @Override

    public void ataqueElemental(Criatura inimigo){

        if (inimigo.getNomeCriatura().equals("StoneDev")) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 2));
            inimigo.receberDano(dano);
            
        } else if (inimigo.getNomeCriatura().equals("WaveNerd")) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 1));
            inimigo.receberDano(dano);
            

        } else if (inimigo.getNomeCriatura().equals("BurnCoder")) {
            int dano = ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 1));
            inimigo.receberDano(dano);
            

        } else if (inimigo.getNomeCriatura().equals("BreezeHacker")) {
            int dano = (int) ((getPoder() * getAtaque()) / (inimigo.getDefesa() * 0.5));
            inimigo.receberDano(dano);
            
        }

        
    }
    
}
