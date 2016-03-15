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
        Opcion op4=new Opcion("Mexico",false);
        
        Opcion o1op2=new Opcion("Tokio",false);
        Opcion o2op2=new Opcion("Bejin",true);
        Opcion o3op2=new Opcion("Seul",false);
        Opcion o4op2=new Opcion("Pyonjiang",false);
        
        
        ArrayList<Opcion>opciones=new ArrayList<Opcion>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        ArrayList<Opcion>opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(o1op2);
        opcionesp2.add(o2op2);
        opcionesp2.add(o3op2);
        opcionesp2.add(o4op2);
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        Pregunta p2=new Pregunta("Capital de China", opciones);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        return preguntas;
    }
} 
    

