

/**
 * Criatura
 */


public abstract class Criatura {
   
    private String nomeCriatura;
    private int vida;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private String tipoCriatura;



    public Criatura(String nomeCriatura, String tipoCriatura) {
        this.nomeCriatura = nomeCriatura;
        this.tipoCriatura = tipoCriatura;

        
       

       }


    // Getters and Setters

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
   

   
public void ataqueFisico(Criatura inimigo){
        System.out.println("\n" + getNomeCriatura());
        System.out.println("Ataque Físico");

        int dano = (getPoder() * getAtaque()) / inimigo.getDefesa();

        inimigo.receberDano(dano);

        posAtaque(dano, inimigo);
    }



    public void receberDano(int dano){

        setVida(getVida() - dano);

    }


    public abstract void ataqueElemental(Criatura inimigo);


    
    public void posAtaque(int dano, Criatura inimigo) {
        System.out.printf("Dano aplicado: %d\n", dano);
        int vidaInimigo = inimigo.getVida() <= 0 ? 0 : inimigo.getVida();
        System.out.printf("Vida do inimigo: %d\n", vidaInimigo);
    }
}