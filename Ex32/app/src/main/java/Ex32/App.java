/**
 * 32. Escreva um algoritmo que leia três valores inteiros e verifique 
 *     se eles podem ser os lados de um triângulo. Se forem, informar qual 
 *     o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
 *     Propriedade: o comprimento de cada lado de um triângulo é menor do 
 *     que a soma dos comprimentos dos outros dois lados. 
 *          a. Triângulo Equilátero: aquele que tem os comprimentos dos 
 *          três lados iguais; 
 *          b. Triângulo Isóscele: aquele que tem os comprimentos de dois 
 *          lados iguais.
 *          c. Triângulo equilátero é também isóscele; 
 *          d. Triângulo Escaleno: aquele que tem os comprimentos de seus 
 *          três lados diferentes;
 */
package Ex32;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Lado 1:");
        float lado1 = l.nextFloat();
        System.out.println("Lado 2:");
        float lado2 = l.nextFloat();
        System.out.println("Lado 3:");
        float lado3 = l.nextFloat();
        
        if(lado1 < lado2+lado3 && lado2 < lado1+lado3 & lado3 < lado1+lado2){
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("Triangulo equilatero");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("Triangulo isosceles");
            }
            else{
                System.out.println("Triangulo escaleno");
            }
        }
        else{
            System.out.println("Nao e triangulo");
        }
    }
}
