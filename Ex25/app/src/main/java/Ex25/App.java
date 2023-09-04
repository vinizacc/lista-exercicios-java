/**
 * 25. Faça um algoritmo que leia dois números e identifique se são iguais ou 
 *     diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que 
 *     eles são iguais. Caso sejam diferentes, informe qual número é o 
 *     maior, e uma mensagem que são diferentes;
 */
package Ex25;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Numero 1: ");
        float n1 = l.nextFloat();
        System.out.println("Numero 2: ");
        float n2 = l.nextFloat();
        if(n1 == n2 ){
            System.out.println("Numeros iguais.");
        }
        else{
            if(n1 > n2){
                System.out.println("Numero maior: " + n1);
            }
            else{
                System.out.println("Numero maior: "+ n2);
            }
            System.out.println("Numeros diferentes.");
        }
    }
}
