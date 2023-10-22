import criaturas.*;

import java.util.List;
import java.util.stream.Collectors;


public class Torneio {
    private final Criatura oponente;
    private final List<Criatura> oponentes;

    public Torneio(Criatura oponente) {
        this.oponente = oponente;

        List<Criatura> oponentes = List.of(new StoneDev(), new WaveNerd(), new BurnCoder(), new BreezeHacker());
        oponentes = oponentes.stream().filter(oponente -> oponente.getClass() != oponente.getClass()).collect(Collectors.toList());

        this.oponentes = oponentes;
    }

    private int getTotalOponentes() {
        return this.oponentes.size();
    }


    public void iniciaTorneio() {
        while (this.getTotalOponentes() > 0) {
            Criatura oponente = this.oponentes.remove(0);

            Batalha batalha = new Batalha(this.oponente, oponente);
            Batalha.Resultado resultado = batalha.iniciaBatalha();

            if (resultado == Batalha.Resultado.DERROTA) {
                Menu.sair();
            }

            this.oponente.resetaVida();
        }
        System.out.println("Parabens você venceu o torneio!");
    }
}