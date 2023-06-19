package Begginning;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        Soma soma = new Soma();
        Diminuir diminuir = new Diminuir();
        Multiplicar multiplicar = new Multiplicar();
        Dividir dividir = new Dividir();




        System.out.println("||-------------------------||");
        System.out.println("||-----" + "A soma é: " + soma.soma + " --------||");
        System.out.println("||-----" + "A subtração é: " + diminuir.diminuir + " ---||");
        System.out.println("||-----" + "A multiplicação é: " + multiplicar.Multiplicar + "||");
        System.out.println("||-----" + "A divisão é: " + dividir.Dividir + " -----||");
        System.out.println("||-------------------------||");

    }
}
