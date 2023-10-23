import java.util.ArrayList;
import java.util.Random;

public class Batalha {
    private Menu ataqueMenu = new MenuAtaque();
    private Menu menuProximaBatalha = new MenuProximaBatalha();
    private Random rand = new Random();
    private AtributosBatalha AtributosBatalha = new AtributosBatalha();
    private boolean proximaBatalha = true;

    public void gameBatalha(ArrayList<Criatura> criaturasDisponiveis, Criatura criaturaSelecionada, Torneio torneio) {
        int criaturaSelecionadaVida = criaturaSelecionada.getVida();
        for (int i = 0; i < criaturasDisponiveis.size(); i++) {
            if (AtributosBatalha.checarVelocidade(criaturasDisponiveis.get(i), criaturaSelecionada)) {
                do {
                    ataqueMenu.partesJogo();
                    switch (ataqueMenu.getOpcao()) {
                        case 3:
                            ataqueMenu.sairJogo(torneio);
                            break;
                        default:
                            AtributosBatalha.ataqueUsuario(ataqueMenu.getOpcao(), criaturasDisponiveis.get(i), criaturaSelecionada);
                    }

                    if (AtributosBatalha.checarVida(criaturasDisponiveis.get(i))) {
                        System.out.println("\nParabéns você foi o campeão da batalha :)");
                        if (criaturasDisponiveis.size() - 1 == i) {
                            System.out.println("\nVocê foi o grande campeão do torneio ElementOOPs");
                        }
                        menuProximaBatalha.partesJogo();
                        criaturaSelecionada.setVida(criaturaSelecionadaVida);
                        break;
                    }

                    AtributosBatalha.inimigoAtaque(rand.nextInt((2 - 1) + 1) + 1, criaturasDisponiveis.get(i), criaturaSelecionada);

                    if (AtributosBatalha.checarVida(criaturaSelecionada)) {
                        System.out.println("\n Infelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.proximaBatalha = false;
                        break;
                    }

                } while (criaturasDisponiveis.get(i).getVida() > 0 || criaturaSelecionada.getVida() > 0);
            } else {
                do {
                    AtributosBatalha.ataqueUsuario(rand.nextInt((2 - 1) + 1) + 1, criaturasDisponiveis.get(i), criaturaSelecionada);

                    if (AtributosBatalha.checarVida(criaturaSelecionada)) {
                        System.out.println("\nInfelizmente não foi dessa vez, você foi derrotado :( ...");
                        this.proximaBatalha = false;
                        break;
                    }

                    ataqueMenu.partesJogo();
                    switch (ataqueMenu.getOpcao()) {
                        case 3:
                            ataqueMenu.sairJogo(torneio);
                            break;
                        default:
                            AtributosBatalha.ataqueUsuario(ataqueMenu.getOpcao(), criaturasDisponiveis.get(i), criaturaSelecionada);
                    }

                    if (AtributosBatalha.checarVida(criaturasDisponiveis.get(i))) {
                        System.out.println("\nParabéns você foi o campeão da batalha :)");
                        if (criaturasDisponiveis.size() - 1 == i) {
                            System.out.println("\nVocê foi o grande campeão do torneio ElementOOPs");
                        }
                        menuProximaBatalha.partesJogo();
                        criaturaSelecionada.setVida(criaturaSelecionadaVida);
                        break;
                    }

                } while (criaturasDisponiveis.get(i).getVida() > 0 || criaturaSelecionada.getVida() > 0);
            }

            if (!proximaBatalha) {
                break;
            }

            if (menuProximaBatalha.getOpcao() == 2) {
                menuProximaBatalha.sairJogo(torneio);
                break;
            }
        }
    }
}