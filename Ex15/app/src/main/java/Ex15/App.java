package Ex15;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float numero = 0f;
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digita um valor");
        
        numero = leitorScanner.nextFloat(); // Sentença que cria a requisão de entrada de dados
        
        if(numero > 100 && numero < 200){
            System.out.println("Esta entre o intervalo.");
        }
        else{
            System.out.println("Nao esta entre o intervalo.");
        }

    }

    Object getGreeting() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
