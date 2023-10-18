package Torneio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Torneio {

        Scanner scanner = new Scanner(System.in);
        
        // Criar uma lista de criaturas adversárias
        List<Criatura> oponentes = new ArrayList<>();
        oponentes.add(new Criatura("Oponente 1", "água")); // Exemplo
        oponentes.add(new Criatura("Oponente 2", "fogo")); // Exemplo
        oponentes.add(new Criatura("Oponente 3", "ar"));   // Exemplo

        // Embaralhar a ordem dos oponentes
        Collections.shuffle(oponentes);

        // Vida inicial do jogador
        int vidaJogador = 100;

        // Iniciar o torneio
        for (int i = 0; i < oponentes.size(); i++) {
            System.out.println("Torneio - Batalha " + (i + 1));

            // Restaurar a vida do jogador
            vidaJogador = 100;

            // Obter o oponente atual
            Criatura oponente = oponentes.get(i);

            // Verificar o tipo da criatura do jogador
            String tipoCriaturaJogador = CriaturaSelecionada.getTipoCriatura();

            System.out.println("Você está lutando contra " + oponente.getNomeCriatura());

            // O jogador só pode realizar um ataque elemental correspondente ao seu tipo
            if (tipoCriaturaJogador.equals("terra")) {
                // O jogador é do tipo "terra", só pode atacar com elemento "terra"
                System.out.println("Escolha uma ação:");
                System.out.println("1. Ataque físico");
                System.out.println("2. Ataque elemental");

                int acao = scanner.nextInt();

                if (acao == 2) {
                    double fatorElemental = calcularFatorElemental(tipoCriaturaJogador);
                    double dano = calcularDano(10, 10, fatorElemental); // Exemplo de valores
                    System.out.println("Você causou " + dano + " de dano ao " + oponente.getNomeCriatura());
                    oponente.setVida(oponente.getVida() - dano);
                }
            }

            // Implemente a lógica das batalhas (ver código anterior) com base no tipo das criaturas.

            if (vidaJogador <= 0) {
                System.out.println("Você foi derrotado.");
                break; // Saia do loop se o jogador for derrotado
            }
        }

        if (vidaJogador > 0) {
            System.out.println("Você venceu o torneio!");
            break
        } else {
            System.out.println("Você foi derrotado no torneio.");
            break
        }
        private static double calcularFatorElemental(String tipoAtacante, int elementoAtaque) {
            if (tipoAtacante.equals("terra")) {
                if (elementoAtaque == 1) {
                    return 0.5; // Ataque de terra contra terra
                } else if (elementoAtaque == 2 || elementoAtaque == 3 || elementoAtaque == 4) {
                    return 2.0; // Ataque de terra contra água, fogo ou ar
                }
            } else if (tipoAtacante.equals("água")) {
                if (elementoAtaque == 1 || elementoAtaque == 3) {
                    return 2.0; // Ataque de água contra terra ou fogo
                } else if (elementoAtaque == 2) {
                    return 0.5; // Ataque de água contra água
                } else if (elementoAtaque == 4) {
                    return 1.0; // Ataque de água contra ar
                }
            } else if (tipoAtacante.equals("fogo")) {
                if (elementoAtaque == 2 || elementoAtaque == 4) {
                    return 2.0; // Ataque de fogo contra água ou ar
                } else if (elementoAtaque == 1) {
                    return 0.5; // Ataque de fogo contra terra
                } else if (elementoAtaque == 3) {
                    return 1.0; // Ataque de fogo contra fogo
                }
            } else if (tipoAtacante.equals("ar")) {
                if (elementoAtaque == 1) {
                    return 2.0; // Ataque de ar contra terra
                } else if (elementoAtaque == 2) {
                    return 1.0; // Ataque de ar contra água
                } else if (elementoAtaque == 3 || elementoAtaque == 4) {
                    return 2.0; // Ataque de ar contra fogo ou ar
                }
            }
    }

    

