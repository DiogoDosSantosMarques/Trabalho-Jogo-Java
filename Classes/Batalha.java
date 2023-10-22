import criaturas.Criatura;

public class Batalha {
    private enum Turno {
        jogador, oponente
    }
    public enum Resultado {
        VITORIA, DERROTA
    }

    private final Criatura jogador;
    private final Criatura oponente;
    private Turno turno;

    public Batalha(Criatura jogador, Criatura oponente) {
        this.jogador = jogador;
        this.oponente = oponente;

        if (jogador.getVelocidade() > oponente.getVelocidade()) {
            this.turno = Turno.jogador;
        } else {
            this.turno = Turno.oponente;
        }
    }

    private boolean isDerrota() {
        return this.jogador.getVida() < 1;
    }

    private boolean isVitoria() {
        return this.oponente.getVida() < 1;
    }

    private void proximoTurno() {
        if (this.isTurnoJogador()) {
            this.turno = Turno.oponente;
        } else {
            this.turno = Turno.jogador;
        }
    }

    private boolean isTurnoJogador() {
        return this.turno == Turno.jogador;
    }

    public Resultado iniciaBatalha() {
        while (!this.isDerrota()) {
            //TODO move sout to menu
            System.out.println("\n-----");
            System.out.println("Status da batalha: ");
            System.out.println("jogador: " + jogador.getTipoCriatura());
            System.out.println("vida: " + jogador.getVida());
            System.out.println("oponente: " + oponente.getTipoCriatura());
            System.out.println("vida: " + oponente.getVida());
            System.out.println("-----");


            if (this.isTurnoJogador()) {
                System.out.println("Turno do jogador");
                Menu.TipoAtaque tipoAtaque = Menu.getTipoAtaque();

                int pontosAtaque = 0;
                if (tipoAtaque == Menu.TipoAtaque.FISICO) {
                    pontosAtaque = this.jogador.getAtaqueFisico(oponente);
                } else if (tipoAtaque == Menu.TipoAtaque.ELEMENTAL) {
                    pontosAtaque = this.jogador.getAtaqueElemetal(oponente);
                }

                System.out.println("oponente recebe " + pontosAtaque + " pontos dano");
                this.oponente.recebeDano(pontosAtaque);
            } else {
                System.out.println("Turno do oponente");

                int pontosAtaque = 0;
                if (Math.random() < 0.5) {
                    System.out.println("oponente realiza um ataque fisico");
                    pontosAtaque = this.oponente.getAtaqueFisico(oponente);
                } else {
                    System.out.println("oponente realiza um ataque elemental");
                    pontosAtaque = this.oponente.getAtaqueElemetal(oponente);
                }

                System.out.println("jogador recebe " + pontosAtaque + " pontos dano");
                jogador.recebeDano(pontosAtaque);
            }

            if (this.isVitoria()) {
                System.out.println("Parabens você venceu a batalha!");
                return Resultado.VITORIA;
            } else {
                this.proximoTurno();
            }
        }
        // TODO mover para o menu logica do torneio
        System.out.println("Voce foi derrotado!");
        return Resultado.DERROTA;
    }
}