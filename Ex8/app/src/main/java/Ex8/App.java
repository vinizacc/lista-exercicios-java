/**
 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em 
 *    real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o 
 *    valor da cotação do dólar e também a quantidade de dólares disponíveis com 
 *    o usuário;
 *    dolar pra real
*/
package Ex8;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Cotacao dolar: ");
        float cotacao = l.nextFloat();
        System.out.println("Dolar disponivel: ");
        float dolar = l.nextFloat();
        float realFinal = cotacao * dolar;
        System.out.println("Conversao dolar em real: "+realFinal);
    }
}