/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    
    public static void main(String[] args) {
        //declaramos un arreglo entero y lo inicializamos
        int x[]={1,34,6,8};
        
        float []y=new float[4];
       float z;
        //Todos los arreglos son tratados como objetos
        
        System.out.println(x[3]);
       
        
        
        A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]);
        //Vamos a iterar el primer arreglo X
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
            
          }
        //El ciclo for para X pero mejorado
        for(int w:x){
            System.out.println(w);
            
            
        }
        
    }
    
}
class A{
    float m;
    
}