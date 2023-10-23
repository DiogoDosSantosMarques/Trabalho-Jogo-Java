import java.util.ArrayList;

public class AtributosBatalha {
    private Criatura stoneDev = new StoneDev();
    private Criatura waveNerd = new WaveNerd();
    private Criatura burnCoder = new BurnCoder();
    private Criatura breezeHacker = new BreezeHacker();

    private ArrayList<Criatura> criaturasDisponiveis = new ArrayList<Criatura>();

    public ArrayList<Criatura> getCriaturasDisponiveis() {
        return criaturasDisponiveis;
    }

    public void defineCriaturasDisponiveis(Criatura criaturaSelecionada) {
        criaturasDisponiveis.add(stoneDev);
        criaturasDisponiveis.add(waveNerd);
        criaturasDisponiveis.add(burnCoder);
        criaturasDisponiveis.add(breezeHacker);

        for (int i = 0; i < criaturasDisponiveis.size(); i++) {
            if (criaturasDisponiveis.get(i).getTipoCriatura() == criaturaSelecionada.getTipoCriatura()) {
                criaturasDisponiveis.remove(i);
            }
        }
    }

    public boolean checarVida(Criatura inimigo) {
        return inimigo.getVida() < 1;
    }

    public boolean checarVelocidade(Criatura inimigo, Criatura CriaturaSelecionada) {
        return CriaturaSelecionada.getVelocidade() > inimigo.getVelocidade();
    }

    public void ataqueUsuario(int opcao, Criatura inimigo, Criatura criaturaSelecionada) {
        switch (opcao) {
            case 1:
                criaturaSelecionada.ataqueFisico(criaturaSelecionada);
                break;
            case 2:
                criaturaSelecionada.ataqueElemental(inimigo);
                break;
        }
    }

    public void inimigoAtaque(int opcao, Criatura inimigo, Criatura criaturaSelecionada) {
        switch (opcao) {
            case 1:
                inimigo.ataqueFisico(criaturaSelecionada);;
                break;
            case 2:
                inimigo.ataqueElemental(criaturaSelecionada);
                break;
        }
    }
}