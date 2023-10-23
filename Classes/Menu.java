import java.util.Scanner;

public abstract class Menu {
    
      private static int opcao;
      private Scanner s = new Scanner(System.in);

      public Menu() {
        setOpcao(opcao);
        setS(s);
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        Menu.opcao = opcao;
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
            System.out.println("Saindo do jogo");
            System.exit(0);
        } else {
            torneio.iniciarJogo();
        }
    }

    
    public abstract void partesJogo();

}    
