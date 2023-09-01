/**
 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais 
 *     o percentual do distribuidor e dos impostos aplicados (primeiro os 
 *     impostos são aplicados sobre o custo de fábrica, e depois o percentual 
 *     do distribuidor sobre o resultado). Supondo que o percentual do 
 *     distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que 
 *     leia o custo de fábrica de um carro e informe o custo ao consumidor 
 *     o seu valor final;
 */
package Ex12;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Custo fabrica: ");
        float custoFabrica = l.nextFloat();
        float valorFinal = ((custoFabrica * 1.45f) * 1.28f);
        System.out.println("Valor final: "+ valorFinal);
    }
}
