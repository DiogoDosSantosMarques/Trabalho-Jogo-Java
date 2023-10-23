public class Torneio {
    private Menu comecoJogo = new MenuComecoJogo();
    private Menu escolhaCriaturas = new MenuEscolhaCriaturas();
    private Menu menuTorneio = new MenuTorneio();
    private Batalha batalha = new Batalha();
    private AtributosBatalha atributosBatalha = new AtributosBatalha();

    private Criatura criaturaSelecionada;

    public Criatura getCriaturaSelecionada() {
        return criaturaSelecionada;
    }

    public void setCriaturaSelecionada(Criatura criaturaSelecionada){

    }
    
    private void defineCriaturaJogador(int selecaoJogador) {
        switch (selecaoJogador) {
            case 1:
                criaturaSelecionada = new StoneDev("StoneDev","Terra");
                break;
            case 2:
                criaturaSelecionada = new WaveNerd("WaveNerd","Água");
                break;
            case 3:
                criaturaSelecionada = new BurnCoder("BurnCoder","Fogo");
                break;
            case 4:
                criaturaSelecionada = new BreezeHacker("BreezeHacker","Ar");
                break;
        }
    }
    

    public void iniciarJogo() {
        comecoJogo.partesJogo();

        switch (comecoJogo.getOpcao()) {
            case 1:
                escolhaCriaturas.partesJogo();
                break;
            case 2:
                comecoJogo.sairJogo(this);
        }

        switch (escolhaCriaturas.getOpcao()) {
            case 5:
                escolhaCriaturas.sairJogo(this);
                break;
            default:
                this.defineCriaturaJogador(escolhaCriaturas.getOpcao());
                escolhaCriaturas.partesJogo();
        }

        switch (menuTorneio.getOpcao()) {
            case 1:
                atributosBatalha.defineCriaturasDisponiveis(criaturaSelecionada);
                batalha.gameBatalha(atributosBatalha.getCriaturasDisponiveis(), getCriaturaSelecionada(), this);
                break;
            case 2:
                menuTorneio.sairJogo(this);
        }
    }

}

