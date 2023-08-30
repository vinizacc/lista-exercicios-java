//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma
package Ex1;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float n1 = l.nextFloat();
        System.out.println("Digite outro numero: ");
        float n2 = l.nextFloat();
        float soma = n1 + n2;
        System.out.println("Soma: " + soma);
    }
}
