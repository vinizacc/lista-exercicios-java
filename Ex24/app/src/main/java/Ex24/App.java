package Ex24;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float numero = 0;
        boolean verificado = false;
        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("Deseja verificar um numero? (1 - SIM / 2 - NAO)");
            int verifica = leitor.nextInt();
            if(verifica == 1){
                System.out.println("Digite o numero: ");
                float valorVariavel = leitor.nextFloat();
                if(valorVariavel > 0){
                    System.out.println("Numero positivo!");
                }
                else if(valorVariavel == 0){
                    System.out.println("Numero igual a zero!");
                }
                else{
                    System.out.println("Numero negativo!");
                }
                verificado = true;
            }
            else{
                verificado = false;
            }
        } while(verificado = true);
    }
}
