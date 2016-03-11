/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
/**
 *
 * @author mathz_000
 */
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //Vamos a crear una sola pregunta con 3 opciones
        Opcion op1=new Opcion("Moscu",true);
        Opcion op2=new Opcion("Florencia",false);
        Opcion op3=new Opcion("Paris",false);
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        return preguntas;
    }
} 
    

