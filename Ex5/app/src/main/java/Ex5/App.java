/**
 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três 
 * provas que ele obteve no semestre. No final informar o nome do aluno e a 
 * sua média (aritmética);
 */
package Ex5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        float media, n1, n2, n3;
        String nome;
        System.out.println("Nome: ");
        nome = l.next();
        System.out.println("Nota 1: ");
        n1 = l.nextFloat();
        System.out.println("Nota 2: ");
        n2 = l.nextFloat();
        System.out.println("Nota 3: ");
        n3 = l.nextFloat();
        media = (n1 + n2 + n3) / 3;
        System.out.println("Nome aluno: " + nome);
        System.out.println("Media: " + media);
    }
}