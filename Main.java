import java.util.Scanner;
public class Main {
    public static void main(String[] args){

       Scanner s = new Scanner(System.in);


       while (true) {
        System.out.println("Bem-vindo ao jogo!");
        System.out.println("Opções:");
        System.out.println("1. Iniciar novo jogo");
        System.out.println("2. Sair do programa");
        System.out.print("Escolha uma opção: ");
        
       int decisaoMenuInicial = s.nextInt();

        if (decisaoMenuInicial == 1){

        
        System.out.println("Escolha uma criatura para ver seu nome e elemento:");
        System.out.println("1. StoneDev");
        System.out.println("2. WaveNerd");
        System.out.println("3. BurnCoder");
        System.out.println("4. BreezeHacker");
        System.out.print("Escolha uma opção: ");
        int escolha = s.nextInt();

        Criatura CriaturaSelecionada = null;

        switch (escolha) {
            case 1:
                CriaturaSelecionada = new StoneDev("StoneDev", "Terra");
                break;
            case 2:
                CriaturaSelecionada = new WaveNerd("WaveNerd", "Água");
                break;
            case 3:
                CriaturaSelecionada = new BurnCoder("BurnCoder", "Fogo");
                break;
            case 4:
                CriaturaSelecionada= new BreezeHacker("BreezeHacker", "Ar");
                break;
            default: 
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Você escolheu a criatura " + CriaturaSelecionada.getNomeCriatura() + " do tipo " + CriaturaSelecionada.getTipoCriatura());
        
    
        } else if (decisaoMenuInicial == 2) {
            System.out.println("Saindo do programa.");
            break;
       

    
    
}

}

    }

}
