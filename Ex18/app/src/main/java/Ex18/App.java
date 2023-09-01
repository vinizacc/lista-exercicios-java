/**
 * 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre uma mensagem
 *     informando “maior de idade” e “menor de idade” para cada pessoa. 
 *     Considere a idade a partir de 18 anos como maior de idade;
 */

package Ex18;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int tamanhoArray = 75;
        int[] pessoas = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Idade: ");
            int idade = l.nextInt();
            if(idade < 18){
                System.out.println("Menor de idade!");
            }
            else{
                System.out.println("Maior de idade!");
            }
        }
    }
}
