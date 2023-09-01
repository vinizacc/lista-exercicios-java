/**
 * 17. Leia 80 números e ao final informar quantos número(s) est(á)ão no 
 *     intervalo entre 10 (inclusive) e 150 (inclusive);
 */
package Ex17;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int tamanhoArray = 3;
        int[] valores = new int[tamanhoArray];
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Posicao " + i +" - Valor: ");
            valores[i] = l.nextInt();
        }
        System.out.println("Numero(s) no intervalo: ");
        for (int i = 0; i < tamanhoArray; i++) {
            if(valores[i] >= 10 && valores[i] <= 150){
                System.out.println(valores[i]);
            }
        }
    }
}
