/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //ciclo de vida del threads sin contar pausa
        //1.Creado
        MiPrimerThread t1=new MiPrimerThread();
        //otro thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        //Opcionamente lo nombramos
        t1.setName(" Penacho");
        t2.setName("JUANA");
        t3.setName("Pedro");
        
        //2.Inicializado
        t1.start();
        t2.start();
        
        //3. Cuandos se corra el programa estara en estado de ejecucion
       //active su metodo run
        
        //5.Cuando acomplete su tarea del codifo run
        
       
    }

    @Override
    public void run() {
        //Primero preguntamos si es el thread 2 y si si que imprima de 1 - 10
        
        if(Thread.currentThread().getName().equals("JUANA")){
            int x=1;
            for(int i=0; i<10;i++){
                System.out.println(x++);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
   
}
