/**
 * 35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
 *     Sabe-se que o cálculo da conta de luz segue a tabela abaixo: Tipo de 
 *     Cliente Valor do KW/h
 *     a. (Residência) 0,60;
 *     b. (Comércio) 0,48;
 *     c. (Indústria) 1,29.
 *     Peça como entrada o Kw/h gasto e qual é o tipo de locação.
 */
package Ex35;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Kw/h gasto: ");
        float kwh = l.nextFloat();
        System.out.println("Tipo de locacao: ");
        char locacao = l.next().charAt(0);
        float valorTotal = 0;
        switch(locacao){
            case 'a':
                valorTotal = kwh * 0.6f;
                valorTotal = (float)Math.floor(valorTotal);
                break;
            case 'b':
                valorTotal = kwh * 0.48f;
                valorTotal = (float)Math.floor(valorTotal);
                //0.48
                break;
            case 'c':
                valorTotal = kwh * 1.29f;
                valorTotal = (float)Math.floor(valorTotal);
                //1.29
                break;
            default:
                System.out.println("Entrada invalida");
        }
        System.out.println("O valor a ser pago: "+ valorTotal);
    }
}
