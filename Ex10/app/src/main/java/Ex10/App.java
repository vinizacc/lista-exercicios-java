/**
 * 10. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) 
 *     prestações sem juros. Faça um algoritmo que receba um valor de 
 *     uma compra e mostre o valor das prestações;
 */
package Ex10;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Valor compra: ");
        float compra = l.nextFloat();
        float prestacoes = compra / 5;
        System.out.println("Valor prestacoes: "+ prestacoes);
    }
}