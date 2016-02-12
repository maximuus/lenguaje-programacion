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
public class ValidarEdad {
    public static void checharEdadNegativa (int edad)throws ValorNoNegativoException{
       if(edad<0)throw new ValorNoNegativoException();
       
        }
    public static void checarMenorEdad(int edad)throws MenorDeEdadExcepetion{
        if(edad<18)throw new MenorDeEdadExcepetion();
        
    }
}
