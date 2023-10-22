public class MenuTorneio extends Menu {

    @Override
    public void partesJogo(){
        do {
          
            System.out.println("Torneio");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Iniciar Torneio");
            System.out.println("2 - Sair do programa");
            
            setOpcao(getS().nextInt());
        } while (getOpcao() > 2 || getOpcao() < 1);
    }
    
}
