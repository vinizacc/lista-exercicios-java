/**
 * 33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
 *     Faça um algoritmo que calcule e exiba o salário de um professor. 
 *     Sabe-se que o valor da hora/aula segue a tabela abaixo: 
 *       a. Professor Nível 1 R$12,00 por hora/aula;
 *       b. Professor Nível 2 R$17,00 por hora/aula;
 *       c. Professor Nível 3 R$25,00 por hora/aula.
 *     Exiba o nome do professor, quantas aulas foram dadas no mês, e o salário.
 */
package Ex33;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = l.nextLine();
        System.out.println("Nivel do professor: ");
        int nivel = l.nextInt();
        System.out.println("Numero de aulas dadas: ");
        int aulas = l.nextInt();
        float salario = 0;
        switch (nivel){
            case 1:
                salario = aulas * 12;
                break;
            case 2:
                salario = aulas * 17;
                break;
            case 3:
                salario = aulas * 25;
                break;
            default:
                System.out.println("Entrada invalida");
        }
        System.out.println("Nome:\n"+nome+"\nAulas:"+aulas+"\nSalario:"+salario);
    }
}