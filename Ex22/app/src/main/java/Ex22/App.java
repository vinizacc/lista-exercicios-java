package Ex22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner l = new Scanner(System.in);
        
        int i = 0;
        for (; i < 40; i++) {
            System.out.println("Produto: ");
            nomeProduto = l.nextLine();
            System.out.println("Preco custo: ");
            precoCusto = l.nextFloat();
            System.out.println("Preco venda: ");
            precoVenda = l.nextFloat();
            
            totalCusto += precoCusto;
            totalVenda += precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Preco custo = Preco venda");
            
            }
            else{
                if(precoCusto > precoVenda){
                    System.out.println("Prejuizo!");
                }
                else{
                    System.out.println("Lucro!");
                }
            }
            
            System.out.println(nomeProduto + " - preco de venda: " 
                    +precoVenda+ " | preco de custo: "+ precoCusto);
        }
        
        System.out.println("Média custo: " + (totalCusto / i));
        System.out.println("Média venda: "+ (totalVenda / i));
    }
}
