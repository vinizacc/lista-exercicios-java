/*
 * 13. Faça um algoritmo que receba um número e mostre uma mensagem caso 
 *     este número seja maior que 10
 */
package Ex13;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Numero: ");
        float n = l.nextFloat();
        System.out.println((n > 10)?"Maior que 10":"");
    }
}
