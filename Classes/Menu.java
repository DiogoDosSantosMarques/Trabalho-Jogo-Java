import java.util.Scanner;

public class Menu {
    
       static Scanner s = new Scanner(System.in);

       public static void inicioDeJogo(){
        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Opções:");
        System.out.println("1. Iniciar novo jogo");
        System.out.println("2. Sair do programa");
        System.out.print("Escolha uma opção: ");
        
        int decisaoMenuInicial = s.nextInt();

        if (decisaoMenuInicial == 1){
            selecao();

        }else sair();{

        }
    }
        
        public static Criatura selecao() {
            System.out.println("Escolha uma criatura para jogar:");
            System.out.println("1. StoneDev");
            System.out.println("2. WaveNerd");
            System.out.println("3. BurnCoder");
            System.out.println("4. BreezeHacker");
            System.out.print("Escolha uma opção: ");
            int SelecaoJogador = s.nextInt();
        
            if (SelecaoJogador == 1) {
                System.out.println("Você vai jogar com o StoneDev, do tipo terra!" );
            } else if (SelecaoJogador == 2) {
                System.out.println("Você vai jogar com o WaveNerd, do tipo água!");
            } else if (SelecaoJogador == 3) {
                System.out.println("Você vai jogar com o BurnCoder, do tipo fogo!");
            } else if (SelecaoJogador == 4) {
                System.out.println("Você vai jogar com o BreezeHacker, do tipo ar!");
            } else if (SelecaoJogador == 5){
                sair();    
            } else {
                System.out.println("Escolha inválida, tente novamente: ");
                selecao(); 
            }

            switch (SelecaoJogador) {
                case 0:
                    Menu.sair();
                case 1:
                    return new StoneDev("StoneDev", "Terra");
                case 2:
                    return new WaveNerd("WaveNerd", "Água");
                case 3:
                    return new BurnCoder("BurnCoder", "Fogo");
                case 4:
                    return new BreezeHacker("BreezeHacker", "Ar");
                default:
                    throw new Error("Algo deu errado");
            }
        
        }

        public static void sair() {
        System.out.println("Saindo do Jogo");
        System.exit(0);

    }

    public void autenticarSaida(){
        
        System.out.println("Confirmar saída?");
        System.out.println("1. Sim");
        System.out.println("2. Não");

        int escolhaConfirma = s.nextInt();
 
        if (escolhaConfirma == 1){
            System.out.println("Saindo do programa...");
            System.exit(0);

        }else if(escolhaConfirma == 2){
           
            inicioDeJogo();
        }      
        else{
            System.out.println("Escolha uma das opções corretamente!");
            System.out.println("Selecione novamente!");
            autenticarSaida();
        }
        
    }

}    
