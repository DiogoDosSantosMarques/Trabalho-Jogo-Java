import java.util.Scanner;

public abstract class Menu {
    
      private int opcao;
      private Scanner s = new Scanner(System.in);







    public int getOpcao() {
        return opcao;
    }








    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }








    public Scanner getS() {
        return s;
    }








    public void setS(Scanner s) {
        this.s = s;
    }








    public void sairJogo(Torneio torneio){
        int saida;
        System.out.println("Tem certeza que deseja sair do programa ? \n 1 - Sim \n 2 - Não ");

        saida = s.nextInt();

        if(saida == 1) {
            System.out.println("Encerrando programa...");
            System.exit(0);
        } else {
            torneio.startGame();
        }
    }

    
    public abstract void partesJogo();

      

}    
