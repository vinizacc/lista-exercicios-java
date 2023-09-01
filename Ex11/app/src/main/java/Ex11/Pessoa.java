package Ex11;
class Pessoa { 
    float peso;
    float altura;
    public float calcularIMC(){
        float imc = peso / (altura * altura); 
        return imc;
    }
}
