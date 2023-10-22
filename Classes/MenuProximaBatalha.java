public class MenuProximaBatalha extends Menu {

    @Override
    public void partesJogo() {
        do {
          
            System.out.println("Próxima batalha");
          
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - iniciar a próxima batalha");
            System.out.println("2 - Sair do programa");
          
            setOpcao(getS().nextInt());
        } while (getOpcao() < 1 || getOpcao() > 2);

    }
    
}
