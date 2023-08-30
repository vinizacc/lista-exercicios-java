/**
 * 2. Faça um algoritmo que receba dois números e ao final mostre a soma, 
 *    subtração, multiplicação e a divisão dos dois números lidos;
 */
package Ex2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        float n1, n2, soma, div, mult, sub;
        System.out.println("Digite um numero: ");
        n1 = l.nextFloat();
        System.out.println("Digite outro numero: ");
        n2 = l.nextFloat();
        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;
        System.out.println("Soma: "+soma);
        System.out.println("Subtracao: "+sub);
        System.out.println("Multiplicacao: "+mult);
        System.out.println("Divisao: "+div);
    }
}
