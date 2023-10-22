public class Main {
    public static void main(String[] args) {
        Menu.inicioDeJogo();
        Criatura jogador = Menu.selecao();
        Torneio torneio = new Torneio(jogador);
        torneio.iniciaTorneio();
    }
}