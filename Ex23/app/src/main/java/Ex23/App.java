/*
 * 23. Faça um algoritmo que receba um número e mostre uma mensagem caso 
*      este número seja maior que 80, menor que 25 ou igual a 40;
 */
package Ex23;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Numero: ");
        float num = l.nextFloat();
        if(num > 80){
            System.out.println("Numero maior que 80");
        }
        else if(num == 40){
            System.out.println("Numero igual a 40");
        }
        else if(num < 25){
            System.out.println("Numero menor que 25");
        }
        else{
            System.out.println("Nao entra no requisito");
        }
    }
}
