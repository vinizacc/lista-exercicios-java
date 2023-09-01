/**
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe 
 *     qual é o maior;
 */
package Ex14;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Primeiro Numero: ");
        int n1 = l.nextInt();
        System.out.println("Segundo Numero: ");
        int n2 = l.nextInt();
        System.out.println((n1>n2)?"n1 maior que n2":"n2 maior que n1");
    }
}
