/**
    3. Escreva um algoritmo para determinar o consumo médio de um automóvel 
    * sendo fornecida a distância total percorrida pelo automóvel e o 
    * total de combustível gasto;
*/
package Ex3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        float distancia, combGasto, media;
        
        System.out.println("Distancia: ");
        distancia = l.nextFloat();
        System.out.println("Combustivel gasto: ");
        combGasto = l.nextFloat();
        media = combGasto / distancia;
        System.out.println("Media gasta de combustivel : " + media+" l/km");
        
    }
}