/**
 * 28. Escreva um algoritmo para uma empresa que decide dar um reajuste 
 *     a seus 584 funcionários de acordo com os seguintes critérios: 
 *          a. 50% para aqueles que ganham menos do que três salários mínimos;
 *          b. 20% para aqueles que ganham entre três até dez salários mínimos; 
 *          c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
 *          d. 10% para os demais funcionários.
 *      Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
 *      Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
 *      o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar 
 *      sua folha de pagamento;
*/
package Ex28;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        char continuar;
        do {
            System.out.println("Nome: ");
            String nome = l.nextLine();
            System.out.println("Salario: ");
            float salario = l.nextFloat();
            System.out.println("Salario minimo: ");
            float salarioMinimo = l.nextFloat();
            int qtdSalarios;
            qtdSalarios = (int)Math.floor(salario / salarioMinimo);
            float reajuste;
            
            if(qtdSalarios < 3){
                reajuste = salario * 0.5f;  
            }
            else if(qtdSalarios >= 3 && qtdSalarios <= 10 ){
                reajuste = salario * 0.2f;
            }
            else if(qtdSalarios > 10 && qtdSalarios <= 20){
                reajuste = salario * 0.15f;
            }
            else{
                reajuste = salario * 0.1f;
            }
            
            System.out.println("Nome: "+ nome);
            System.out.println("Reajuste: "+ reajuste);
            salario = salario + reajuste;
            System.out.println("Salario novo: "+ salario);
            
            System.out.println("Deseja continuar? N(Nao)");
            continuar = l.next().toLowerCase().charAt(0);
        } while (continuar != 'n');
    }
}
