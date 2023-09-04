/**
 * 27. A concessionária de veículos “CARANGO” está vendendo os seus veículos 
 *     com desconto. Faça um algoritmo que calcule e exiba o valor do desconto 
 *     e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre 
 *     o valor do veículo de acordo com o combustível (álcool – 25%, gasolina 
 *     – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de 
 *     dados. Informe total de desconto e total pago pelos clientes;
 */
package Ex27;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        char continuar;
        do {
            System.out.println("Informe valor veiculo: ");
            float valorVeiculo = l.nextFloat();
            System.out.println("Tipo combustivel:\n1 - Alcool\n2 - Gasolina\n3 - Diesel");
            int tipoCombustivel = l.nextInt();
            float valorComDesconto = 0;
            switch(tipoCombustivel){
                case 1:
                    valorComDesconto = valorVeiculo - (valorVeiculo * 0.25f);
                    break;
                case 2:
                    valorComDesconto = valorVeiculo - (valorVeiculo * 0.21f);
                    break;
                case 3:
                    valorComDesconto = valorVeiculo - (valorVeiculo * 0.14f);
                    break;
                default:
                    System.out.println("entrada invalida");
            }
            System.out.println("Valor com desconto: "+valorComDesconto);
            System.out.println("\n\nDeseja continuar? N(Nao)");
            continuar = l.next().toLowerCase().charAt(0);
        } while (continuar != 'n');
    }
}
