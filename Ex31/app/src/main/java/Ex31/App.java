/**
 * 31. Dados três valores A, B e C, em que A e B são números reais e C é um 
 *     caractere, pede-se para imprimir o resultado da operação de A por B 
 *     se C for um símbolo de operador aritmético; caso contrário deve ser 
 *     impressa uma mensagem de operador não definido. Tratar erro de divisão 
 *     por zero;
 */
package Ex31;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("A: ");
        float a = l.nextFloat();
        System.out.println("B: ");
        float b = l.nextFloat();
        System.out.println("C: ");
        char c = l.next().charAt(0);
        
        switch(c){
            case '+':
                float soma = a + b;
                System.out.println("A + B = "+soma);
                break;
            case '-':
                float sub = a - b;
                System.out.println("A - B = "+sub);
                break;
            case '*':
                float mult = a * b;
                System.out.println("A * B = "+mult);
                break;
            case '/':
                if(b == 0){
                    System.out.println("divisao por zero nao permitida.");
                    break;
                }
                else{
                    float div = a / b;
                    System.out.println("A / B = "+div);
                }
                break;
            default:
                System.out.println("operador invalido");
        }
    }
}
