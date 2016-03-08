/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

import ExamenParcial.SoloUnaCorrectaException;

/**
 *
 * @author mathz_000
 */
public class ValidarOpcion {
    public void validar(Opcion[] opciones)throws SoloUnaCorrectaException{
        int soloUna=0;
        for(Opcion o:opciones){
            if(o.isEstatus()){
                
            }
            soloUna++;
            if(soloUna>1)throw new SoloUnaCorrectaException();
            
        }        
    }
    
    
}
