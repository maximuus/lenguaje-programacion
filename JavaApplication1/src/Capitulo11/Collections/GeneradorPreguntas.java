/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
import javax.swing.JRadioButton;
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
        
        Opcion o1op3=new Opcion("Italia",false);
        Opcion o2op3=new Opcion("Roma",false);
        Opcion o3op3=new Opcion("Madrid",true);
        Opcion o4op3=new Opcion("Barcelona",false);
        
        Opcion o1op4=new Opcion("Chile",false);
        Opcion o2op4=new Opcion("Peru",false);
        Opcion o3op4=new Opcion("Colombia",false);
        Opcion o4op4=new Opcion("Buenas Aires",true);
        
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
        
        ArrayList<Opcion>opcionesp3=new ArrayList<Opcion>();
        opcionesp3.add(o1op3);
        opcionesp3.add(o2op3);
        opcionesp3.add(o3op3);
        opcionesp3.add(o4op3);
        
        ArrayList<Opcion>opcionesp4=new ArrayList<Opcion>();
        opcionesp4.add(o1op4);
        opcionesp4.add(o2op4);
        opcionesp4.add(o3op4);
        opcionesp4.add(o4op4);
        
        
        Pregunta p1=new Pregunta("Capital de Rusia", opciones);
        Pregunta p2=new Pregunta("Capital de China", opcionesp2);
        Pregunta p3=new Pregunta("Capital de España",opcionesp3);
        Pregunta p4=new Pregunta("Capital de Argentina",opcionesp4);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        return preguntas;
    }
    public static boolean checarRespuesta(Pregunta p, JRadioButton[]radios){
        boolean respuesta=false;
        String seleccion="";
        for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion= radio.getText();
            }
        }
        for(Opcion o:p.getOpciones()){
            if(o.isEstatus()){
                if(o.getTitulo().equals(seleccion))respuesta=true;
            }
        }
        
        return respuesta;
    }

    
    
 } 
    

