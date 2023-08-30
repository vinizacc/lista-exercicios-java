/**
    4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário 
       fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
       Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
       efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
*/
package Ex4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String nome;
        float salario, totalVendas;
        double salarioComComi;
        
        System.out.println("Nome: ");
        nome = l.next();
        System.out.println("Salario: ");
        salario = l.nextFloat();
        System.out.println("Total vendas: ");
        totalVendas = l.nextFloat();
        salarioComComi = (totalVendas * 0.15) + salario;
        System.out.println("Nome Vendedor: " + nome);
        System.out.println("Salario fixo: " + salario);
        System.out.println("Salario final: " + salarioComComi);
    }
}