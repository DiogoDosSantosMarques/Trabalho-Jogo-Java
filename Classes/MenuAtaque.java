public class MenuAtaque extends Menu {

    @Override
    public void partesJogo(){
      do {
        System.out.println("\n");
        System.out.println("Ataque");
        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1 - realizar um ataque físico");
        System.out.println("2 - realizar um ataque elemental");
        System.out.println("3 - Sair do programa");
       
        setOpcao(getS().nextInt());
      } while (getOpcao() < 1 || getOpcao() > 3);
  
    }
    
}
