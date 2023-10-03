/**
 * Criatura
 */

 import java.util.Random;

public class Criatura {

    private String nomeCriatura;
    private int vida;
    private int poder;
    private int ataque;
    private int defesa;
    private int velocidade;
    private double ataqueElemental;



    public Criatura(String nomeCriatura ) {
        this.nomeCriatura = nomeCriatura;
       

       

}

// Gerar Caracteristicas aleatórias
    public int gerarValorAleatorio(int min, int max){
        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;

    }

    



    









    // Getters and Setters

    public String getNomeCriatura() {
        return nomeCriatura;
    }


    public double getAtaqueElemental() {
        return ataqueElemental;
    }

    public void setAtaqueElemental(double ataqueElemental) {
        this.ataqueElemental = ataqueElemental;
    }





    public int getVida() {
        return vida == 0 ? gerarValorAleatorio(200, 400) : vida;
    }



    public void setVida(int vida) {
        this.vida = Math.max(200, Math.min(400, vida));
    }



    public int getPoder() {
        return poder == 0 ? gerarValorAleatorio(10, 30): poder;
    }



    public void setPoder(int poder) {
        this.poder = Math.max(10, Math.min(30, poder));
    }



    public int getAtaque() {
        return ataque == 0 ? gerarValorAleatorio(5, 15): ataque;
    }



    public void setAtaque(int ataque) {
        this.ataque = Math.max(5, Math.min(15, ataque));
    }



    public int getDefesa() {
        return defesa == 0 ? gerarValorAleatorio(5, 15): defesa;
    }



    public void setDefesa(int defesa) {
        this.defesa = Math.max(5, Math.min(15, defesa));
    }



    public int getVelocidade() {
        return velocidade == 0 ? gerarValorAleatorio(1, 10): velocidade;
    }



    public void setVelocidade(int velocidade) {
        this.velocidade = Math.max(1, Math.min(10, velocidade));
    }



   

   



    
    
    
    
}