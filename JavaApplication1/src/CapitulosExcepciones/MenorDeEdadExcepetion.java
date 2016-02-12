/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapitulosExcepciones;

/**
 *
 * @author T-101
 */
public class MenorDeEdadExcepetion extends Exception {
    public MenorDeEdadExcepetion(){
        super("No puedo dar de alta a un menor de 18 años");
        
    }
}
