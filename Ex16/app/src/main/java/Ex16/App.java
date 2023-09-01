/**
 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um 
 *     aluno durante o semestre. Calcular a sua média (aritmética), informar 
 *     o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5)
 *     e Recuperação (media entre 5.1 a 6.9);
 */
package Ex16;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = l.next();
        System.out.println("Nota 1: ");
        float n1 = l.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = l.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = l.nextFloat();
        float media = (n1 + n2 + n3) / 3;
        System.out.println("Aluno: " + nome);
        if(media >= 7){
            System.out.println("Aprovado.");
        }
        else if(media > 5 && media < 7){
            System.out.println("Recuperacao.");
        }
        else{
            System.out.println("Reprovado.");            
        }
    }
}
