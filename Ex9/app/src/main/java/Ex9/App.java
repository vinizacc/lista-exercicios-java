/**
 * 9. Faça um algoritmo que receba um valor que foi depositado e exiba 
 *    o valor com rendimento após um mês. Considere fixo o juro da poupança 
 *    em 0,07% a. m;
 */
package Ex9;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Valor depositado: ");
        float deposito = l.nextFloat();
        float valorRendimento = (deposito * 0.07f) + deposito;
        System.out.println("Rendimento: " + valorRendimento);
    }
}