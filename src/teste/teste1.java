package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class teste1 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo de números aleatórios!");

        int pontosTotal = 0;
        boolean jogarNovamente = true;
        Scanner scanner = new Scanner(System.in);

        while (jogarNovamente) {
            System.out.print("Digite o nível de dificuldade (Fácil, Médio, Difícil): ");
            String nivelDificuldade = scanner.nextLine().trim().toUpperCase();

            int pontosJogoAtual = jogar(nivelDificuldade);
            pontosTotal += pontosJogoAtual;

            System.out.print("Quer jogar novamente? (SIM / NÃO): ");
            String resposta = scanner.nextLine().trim().toUpperCase();
            jogarNovamente = resposta.equals("SIM");

            System.out.println();
        }

        System.out.println("Pontuação total: " + pontosTotal);
        System.out.println("Obrigado por jogar!");
    }

    public static int jogar(String nivelDificuldade) {
        int quantidadeNumeros;
        int pontos = 0;

        switch (nivelDificuldade) {
            case "FÁCIL":
                quantidadeNumeros = 5;
                break;
            case "MÉDIO":
                quantidadeNumeros = 10;
                break;
            case "DIFÍCIL":
                quantidadeNumeros = 15;
                break;
            default:
                System.out.println("Nível de dificuldade inválido. Definindo para MÉDIO.");
                quantidadeNumeros = 10;
        }

        List<Integer> numerosGerados = gerarNumerosAleatorios(quantidadeNumeros);

        System.out.println("Gerando números aleatórios de 1 a 100:");
        exibirNumerosGerados(numerosGerados);

        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosDigitados = new ArrayList<>(quantidadeNumeros);

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numeroDigitado = scanner.nextInt();
            numerosDigitados.add(numeroDigitado);

            if (numeroDigitado == numerosGerados.get(i)) {
                System.out.println("Parabéns, você acertou e ganhou 5 pontos!");
                pontos += 5;
            } else if (numeroDigitado == numerosGerados.get(i) - 1 || numeroDigitado == numerosGerados.get(i) + 1) {
                System.out.println("Você está próximo! Ganhou 1 ponto.");
                pontos += 1;
            } else {
                System.out.println("Você errou. O número correto era: " + numerosGerados.get(i));
            }
        }

        System.out.println("Pontuação do jogo atual: " + pontos);

        System.out.println("Números que você acertou: " + numerosDigitados);
        System.out.println("Números que você errou: " + obterNumerosErrados(numerosDigitados, numerosGerados));

        return pontos;
    }

    public static List<Integer> gerarNumerosAleatorios(int quantidade) {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<>(quantidade);

        for (int i = 0; i < quantidade; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        return numeros;
    }

    public static String obterNumerosErrados(List<Integer> numerosDigitados, List<Integer> numerosGerados) {
        StringBuilder numerosErrados = new StringBuilder();

        for (int i = 0; i < numerosDigitados.size(); i++) {
            if (!numerosDigitados.get(i).equals(numerosGerados.get(i))) {
                numerosErrados.append(numerosDigitados.get(i)).append(" ");
            }
        }

        return numerosErrados.toString().trim();
    }

    public static void exibirNumerosGerados(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Número gerado " + (i + 1) + ": " + numeros.get(i));
        }
    }
}
