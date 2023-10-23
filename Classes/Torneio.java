public class Torneio {
    private MenuComecoJogo comecoJogo = new MenuComecoJogo();
    private MenuEscolhaCriaturas escolhaCriaturas = new MenuEscolhaCriaturas();
    private MenuTorneio menuTorneio = new MenuTorneio();
    private Batalha batalha = new Batalha();
    private AtributosBatalha atributosBatalha = new AtributosBatalha();

    private Criatura criaturaSelecionada;

    public Criatura getCriaturaSelecionada() {
        return criaturaSelecionada;
    }

    public void setCriaturaSelecionada(Criatura criaturaSelecionada){
        this.criaturaSelecionada = criaturaSelecionada;  
    }
    
    private void defineCriaturaJogador(int selecaoJogador) {
        switch (selecaoJogador) {
            case 1:
                criaturaSelecionada = new StoneDev();
                break;
            case 2:
                criaturaSelecionada = new WaveNerd();
                break;
            case 3:
                criaturaSelecionada = new BurnCoder();
                break;
            case 4:
                criaturaSelecionada = new BreezeHacker();
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
                menuTorneio.partesJogo();
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

