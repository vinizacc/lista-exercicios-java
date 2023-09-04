/*
 * 26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
 *     Caso o usuário digite um número que não esteja neste intervalo, exibir 
 *     a seguinte mensagem: número inválido;
 */
package Ex26;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Numero: ");
        int num = l.nextInt();
        switch(num){
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            default:
                System.out.println("Numero invalido.");
        }
    }
}
