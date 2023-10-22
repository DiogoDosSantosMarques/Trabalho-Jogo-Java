public class MenuEscolhaCriaturas extends Menu {

    @Override
    public void partesJogo(){
        do {
          
            System.out.println("Escolher Criatura");
            System.out.println("1 - StoneDev - Terra");
            System.out.println("2 - WaveNerd - Água");
            System.out.println("3 - BurnCoder - Fogo");
            System.out.println("4 - BreezeHacker - Ár");
             System.out.println("5 - Sair");
            
            setOpcao(getS().nextInt());
        } while (getOpcao() > 5 || getOpcao() < 1);
    }
    
}
