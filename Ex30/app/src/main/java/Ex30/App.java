/**
 * 30. Escreva um algoritmo que leia três valores inteiros distintos e 
 *     os escreva em ordem crescente;
 */
package Ex30;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int[] numeros = new int[3];
        System.out.println("Numero 1: ");
        numeros[0] = l.nextInt();
        System.out.println("Numero 2: "); 
        numeros[1] = l.nextInt();
        System.out.println("Numero 3: "); 
        numeros[2] = l.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            int minIndex = i;
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[j] < numeros[minIndex]){
                    minIndex = j;
                }
            }   
            int aux;
            aux = numeros[minIndex];
            numeros[minIndex] = numeros[i];
            numeros[i] = aux;
        }
        
        System.out.println("Ordem crescente:\n"+numeros[0]+"\n"+numeros[1]+"\n"+numeros[2]);
    }
}
