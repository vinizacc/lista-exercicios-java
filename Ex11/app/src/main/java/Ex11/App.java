/**
 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre 
 *     o valor de venda. Sabe-se que o preço de venda receberá um acréscimo 
 *     de acordo com um percentual informado pelo usuário;
 */
package Ex11;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Preco custo: ");
        float precoCusto = l.nextFloat();
        System.out.println("Porcentagem: ");
        float porc = l.nextFloat();
        float precoVenda = ((porc / 100)+1) * precoCusto;
        System.out.println("Preco venda: " + precoVenda);
        Pessoa p = new Pessoa();
        
    }
}