/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida del threads sin contar pausa
        //1.Creado
        MiPrimerThread t1=new MiPrimerThread();
        //Opcionamente lo nombramos
        t1.setName(" Penacho");
        
        //2.Inicializado
        t1.start();
        
        //3. Cuandos se corra el programa estara en estado de ejecucion
       //active su metodo run
        
        //5.Cuando acomplete su tarea del codifo run
        
       
    }
   
}
