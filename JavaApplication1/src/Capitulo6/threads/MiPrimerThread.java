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
public class MiPrimerThread extends Thread { // Al momento de poner THREAD todo es se convierte un thread

    @Override
    public void run(){
        System.out.println("soy un thread y me llamo"+this.getName()); // Getname sirve para darle nombre 
    
    }
    
}
