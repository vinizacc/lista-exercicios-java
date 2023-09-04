/**
 * 29. Faça um algoritmo que receba o número do mês e mostre o mês 
 *     correspondente. Valide mês inválido;
 */
package Ex29;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Mes em numero inteiro: ");
        int mes = l.nextInt();
        switch(mes){
            case 1:
                System.out.println("Mes digitado: Janeiro");
                break;
            case 2:
                System.out.println("Mes digitado: Fevereiro");
                break;
            case 3:
                System.out.println("Mes digitado: Março");
                break;
            case 4:
                System.out.println("Mes digitado: Abril");
                break;
            case 5:
                System.out.println("Mes digitado: Maio");
                break;
            case 6:
                System.out.println("Mes digitado: Junho");
                break;
            case 7:
                System.out.println("Mes digitado: Julho");
                break;
            case 8:
                System.out.println("Mes digitado: Agosto");
                break;
            case 9:
                System.out.println("Mes digitado: Setembro");
                break;
            case 10:
                System.out.println("Mes digitado: Outubro");
                break;
            case 11:
                System.out.println("Mes digitado: Novembro");
                break;
            case 12:
                System.out.println("Mes digitado: Dezembro");
                break;
            default:
                System.out.println("Entrada incorreta.");
        }
    }
}
