/**
 * 21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade 
 *     e saúde) e informe se está apta ou não para cumprir o serviço militar 
 *     obrigatório. Informe os totais;
 */ 
package Ex21;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        char continuar;
        String nome;
        char sexo;
        int idade, saude, condicaoAdversa;
        do {
            System.out.println("Nome: ");
            nome = l.next();
            System.out.println("Sexo: (F|M)");
            sexo = l.next().toLowerCase().charAt(0);
            System.out.println("Idade: ");
            idade = l.nextInt();
            System.out.println("Saude: ");
            saude = l.nextInt();
            System.out.println("Condicao adversa? S(Sim) ou N(Nao)");
            condicaoAdversa = l.next().toLowerCase().charAt(0);
            
            if(sexo == 'm'){
                if(idade >= 18 && idade <45){
                    if(saude < 4){
                        //Regra: De 1 à 5 o quão bem está de saúde? 1,2,3 está 
                        //apto, acima não está.
                        if(condicaoAdversa == 'n'){
                            //Regra: Servidores eclesiásticos são obrigados
                            //a não servir ao exército. Também serve para outras
                            //cláusulas especiais
                            System.out.println("O "+ nome + " esta apto ao servico militar obrigatorio!");
                        }
                        else{
                            //Não apto à servir.
                            naoApto();
                        }
                    }
                    else{
                        //Com problemas de saúde
                        naoApto();
                    }
                }
                else{
                    //homem novo ou velho
                    naoApto();
                }
            }
            else{
                //mulher
                naoApto();
            }
            System.out.println("Deseja continuar? N(Nao)");
            continuar = l.next().toLowerCase().charAt(0);
        } while (continuar != 'n');
        
        
    }
    public static void naoApto(){
        System.out.println("Nao esta apto para servir ao exercito");
    }
}
