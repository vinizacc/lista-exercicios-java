/**
 * 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos 
 * valores de forma que a variável A passe a possuir o valor da variável B e 
 * a variável B passe a possuir o valor da variável A. Apresentar os valores 
 * trocados;
 */
package Ex6;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        float varA, varB, aux;
        Scanner l = new Scanner(System.in);
        System.out.println("A: ");
        varA = l.nextFloat();
        System.out.println("B: ");
        varB = l.nextFloat();
        aux = varA;
        varA = varB;
        varB = aux;
        System.out.println("Invertido "); 
        System.out.println("A: " + varA);
        System.out.println("B: " + varB);
    }
}
