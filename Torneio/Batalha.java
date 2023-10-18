package Torneio;
import java.util.Random;
import java.util.Scanner;


public class Batalha extends Torneio {
    
    private static void batalha(Criatura criaturaSelecionada, int numeroBatalha) {
        System.out.println("Batalha " + (numeroBatalha + 1));
        System.out.println(criaturaSelecionada.getNomeCriatura() + " vs. Criatura " + (numeroBatalha + 1));
        
        // puxar atributos das criaturas aqui
      
    
        Random Random = new Random();
        Scanner scanner = new Scanner(System.in);
    
        while (vidaCriaturaSelecionada > 0 && vidaCriaturaOponente > 0) {
            // Verificar quem realiza a ação primeiro com base na VELOCIDADE (Se for igual tem que ser aleatório)
            boolean jogadorRealizaAcao = criaturaSelecionada.getTipoCriatura().equals("terra"); // Exemplo: comparando o tipo com "terra"
    
            if (jogadorRealizaAcao) {
                // Ação do jogador
                System.out.println("Escolha uma ação:");
                System.out.println("1. Ataque físico");
                System.out.println("2. Ataque elemental");
                System.out.println("3. Sair da batalha");
    
                int acao = scanner.nextInt();
    
                if (acao == 1) {
                    // Ataque físico
                    double fatorElemental = 1.0; // Fator igual a 1 para ataque físico
                    double dano = PDRCriaturaSelecionada * 2.0 / PDRCriaturaOponente * fatorElemental;
                    vidaCriaturaOponente -= dano;
                    System.out.println("Você causou " + dano + " de dano à criatura oponente.");
                } else if (acao == 2) {
                    // Ataque elemental
                    double fatorElemental = 1.5; // Fator maior para ataque elemental
                    double dano = PDRCriaturaSelecionada * 2.0 / PDRCriaturaOponente * fatorElemental;
                    vidaCriaturaOponente -= dano;
                    System.out.println("Você causou " + dano + " de dano à criatura oponente com ataque elemental.");
                } else if (acao == 3) {
                    System.out.println("Você saiu da batalha.");
                    return;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                // Ação da criatura controlada pelo jogo
                int acaoAleatoria = Random.nextInt(2); // 0 para ataque físico, 1 para ataque elemental
                double fatorElemental = 1.0;
    
                if (acaoAleatoria == 1) {
                    fatorElemental = 1.5;
                }
    
                double dano = PDRCriaturaOponente * 2.0 / PDRCriaturaSelecionada * fatorElemental;
                vidaCriaturaSelecionada -= dano;
                System.out.println("A criatura oponente causou " + dano + " de dano à sua criatura.");
            }
        }
    
        if (vidaCriaturaSelecionada <= 0) {
            System.out.println("Sua criatura foi derrotada na batalha " + (numeroBatalha + 1) + ".");
        } else if (vidaCriaturaOponente <= 0) {
            System.out.println(criaturaSelecionada.getNomeCriatura() + " venceu a batalha " + (numeroBatalha + 1) + ".");
        }
    }
    
}
