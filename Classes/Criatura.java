import java.util.Random;

public abstract class Criatura {

    private String nomeCriatura;
    private int vida;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private String tipoCriatura;

    Random random = new Random();
    // Construtor
    public Criatura(){
        this.poder = random.nextInt(21) + 10;
        this.ataque = random.nextInt(11) + 5;
        this.defesa = random.nextInt(11) + 5;
        this.velocidade = random.nextInt(10) + 1;
        this.vida = random.nextInt(99) + 100;
        this.nomeCriatura = "Nulo";
    }

    
    public String getNomeCriatura() {
        return nomeCriatura;
    }


    public void setNomeCriatura(String nomeCriatura) {
        this.nomeCriatura = nomeCriatura;
    }


    public int getVida() {
        return vida;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getPoder() {
        return poder;
    }


    public void setPoder(int poder) {
        this.poder = poder;
    }


    public int getAtaque() {
        return ataque;
    }


    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }


    public int getDefesa() {
        return defesa;
    }


    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }


    public int getVelocidade() {
        return velocidade;
    }


    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }


    public String getTipoCriatura() {
        return tipoCriatura;
    }


    public void setTipoCriatura(String tipoCriatura) {
        this.tipoCriatura = tipoCriatura;
    }


    public Random getRandom() {
        return random;
    }


    public void setRandom(Random random) {
        this.random = random;
    }


    // Métodos
    public abstract void ataqueNormal(Criatura oponete);
    public abstract void ataqueElemental(Criatura Oponente);


    @Override
    public String toString() {
        return "Criatura [nomeCriatura=" + nomeCriatura + ", vida=" + vida + ", poder=" + poder + ", ataque=" + ataque
                + ", defesa=" + defesa + ", velocidade=" + velocidade + ", tipoCriatura=" + tipoCriatura + ", random="
                + random + "]";
    }

    
}