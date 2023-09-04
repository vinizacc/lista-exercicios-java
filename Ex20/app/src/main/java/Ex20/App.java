/**
 * 20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus 
 *     veículos com desconto. Faça um algoritmo que calcule e exiba o valor 
 *     do desconto e o valor a ser pago pelo cliente de vários carros. 
 *     O desconto deverá ser calculado de acordo com o ano do veículo. 
 *     Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se 
 *     deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
 *     Informar total de carros com ano até 2000 e total geral;
*/ 
package Ex20;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        char continuar;
        do {
            System.out.println("Sistema CARANGO VELHO - Calculo de desconto");
            System.out.println("Digite o valor do carro: ");
            float valorCarro = l.nextFloat();
            //System.out.println("Digite o ano do carro: ");
            System.out.println("Digite S (Sim) para ano maior que 2000 e N (Nao) para ano menor que 2000 ");
            //float anoCarro = l.nextFloat();
            char anoCarro = l.next().toLowerCase().charAt(0);
            float valorCarroComDesconto = 0;
            if(anoCarro == 's'){
                valorCarroComDesconto = valorCarro - (valorCarro * 0.07f);
            }
            else{
                valorCarroComDesconto = valorCarro - (valorCarro * 0.12f);
            }
            System.out.println("Veiculo com desconto: "+ valorCarroComDesconto);
            System.out.println("Deseja continuar? (N)Nao");
            continuar = l.next().toLowerCase().charAt(0);
        } while(continuar != 'n');
    }
}
