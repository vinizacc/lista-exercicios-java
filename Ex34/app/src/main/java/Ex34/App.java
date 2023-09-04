/**
 * 34. Elabore um algoritmo que, dada a idade de um nadador classifica-o
 *     em uma das seguintes categorias:
 * a. Infantil A = 5 - 7 anos;
 * b. Infantil B = 8 - 10 anos;
 * c. Juvenil A = 11 - 13 anos;
 * d. Juvenil B = 14 - 17 anos;
 * e. Sênior = 18 - 25 anos.
 * Apresentar mensagem “idade fora da faixa etária” quando for outro
 *     ano não contemplado;
 */
package Ex34;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = l.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade <= 25) {
            System.out.println("Senior");
        }

        /**
         * if (idade >= 5) { if (idade >= 8) { if (idade >= 11) { if (idade >=
         * 14) { if(idade >= 18){ if(idade <= 25){ System.out.println("Senior");
         * } } else{ System.out.println("Juvenil B"); } } else {
         * System.out.println("Juvenil A"); } } else {
         * System.out.println("Infantil B"); } } else{
         * System.out.println("Infantil A"); } }
         */
    }
}
