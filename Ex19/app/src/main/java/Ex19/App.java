/**
 * 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe 
 *     o nome e se ela é homem ou mulher. No final informe total de homens 
 *     e de mulheres;
 */ 
package Ex19;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String nome;
        char sexo;
        int totalH = 0;
        int totalM = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: ");
            nome = l.next();
            System.out.println("Sexo: (M - Masculino | F - feminino)");
            
            do {
                sexo = l.next().toLowerCase().charAt(0);
            } while (sexo != 'm' && sexo != 'f');
            
            System.out.println("Nome: " + nome);
            if(sexo == 'm'){
                System.out.println("Homem");
                totalH++;
            }
            else{
                System.out.println("Mulher");
                totalM++;
            }
        }
        System.out.println("Total de mulheres: " + totalM);
        System.out.println("Total de homens: "+ totalH);
    }
}
