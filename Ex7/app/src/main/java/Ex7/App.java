/**
 *7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
 *   Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura 
 *   em Fahrenheit e C a temperatura em Celsius; 
*/
package Ex7;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Temp celsius: ");
        float c = l.nextFloat();
        float f = ((9*c+160)/5);
        System.out.println("Fahrenheit: "+ f);
    }
}
