package javaapplication1;

/*
Clase modelo Imc encapsulada y con 
dos constructores

1. Agregar a los atributos modificador de acceso private
2. Por ada atributo implementar un metodo set
3. 2. Por ada atributo implementar un metodo get
*/
public class Imc {
    private float peso;
    private float altura;
    
    
    public String calcular(){
        float imc=peso/(altura*altura);
        
        return "Tu imc es: "+imc;
}

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
