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
    public static float aciertos;
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //Vamos a crear una sola pregunta con 3 opciones
        Opcion op1=new Opcion("Futbol",true);
        Opcion op2=new Opcion("Basquetball",false);
        Opcion op3=new Opcion("Tenis",false);
        Opcion op4=new Opcion("Futbol Americano",false);
        
        Opcion o1op2=new Opcion("Tenis",false);
        Opcion o2op2=new Opcion("Basquetball",true);
        Opcion o3op2=new Opcion("Voleyball",false);
        Opcion o4op2=new Opcion("Waterpolo",false);
        
        Opcion o1op3=new Opcion("Voleyball",false);
        Opcion o2op3=new Opcion("Golf",false);
        Opcion o3op3=new Opcion("Futbol Americano",true);
        Opcion o4op3=new Opcion("Rugby",false);
        
        Opcion o1op4=new Opcion("Golf",false);
        Opcion o2op4=new Opcion("Futbol",false);
        Opcion o3op4=new Opcion("Natacion",false);
        Opcion o4op4=new Opcion("Tenis",true);
        
        Opcion o1op5=new Opcion("Futbol Americano",false);
        Opcion o2op5=new Opcion("Rugby",false);
        Opcion o3op5=new Opcion("Tiro con Arvo",false);
        Opcion o4op5=new Opcion("Golf",true);
        
        Opcion o1op6=new Opcion("45 mins",false);
        Opcion o2op6=new Opcion("30 mins",false);
        Opcion o3op6=new Opcion("90 mins",true);
        Opcion o4op6=new Opcion("120 mins",false);
        
        Opcion o1op7=new Opcion("Real Madrid",true);
        Opcion o2op7=new Opcion("Barcelona",false);
        Opcion o3op7=new Opcion("Manchester City",false);
        Opcion o4op7=new Opcion("Bayer Münich",false);
        
        Opcion o1op8=new Opcion("Brasil",false);
        Opcion o2op8=new Opcion("Peru",false);
        Opcion o3op8=new Opcion("Argentina",false);
        Opcion o4op8=new Opcion("Alemania",true);
        
        Opcion o1op9=new Opcion("Chivas",false);
        Opcion o2op9=new Opcion("Cruz Azul",false);
        Opcion o3op9=new Opcion("America",true);
        Opcion o4op9=new Opcion("Pumas",false);
        
        Opcion o1op10=new Opcion("Negrito",false);
        Opcion o2op10=new Opcion("Chicharito",true);
        Opcion o3op10=new Opcion("Frijolito",false);
        Opcion o4op10=new Opcion("Matador",true);
        
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
        
        ArrayList<Opcion>opcionesp5=new ArrayList<Opcion>();
        opcionesp5.add(o1op5);
        opcionesp5.add(o2op5);
        opcionesp5.add(o3op5);
        opcionesp5.add(o4op5);
        
        ArrayList<Opcion>opcionesp6=new ArrayList<Opcion>();
        opcionesp6.add(o1op6);
        opcionesp6.add(o2op6);
        opcionesp6.add(o3op6);
        opcionesp6.add(o4op6);
        
        ArrayList<Opcion>opcionesp7=new ArrayList<Opcion>();
        opcionesp7.add(o1op7);
        opcionesp7.add(o2op7);
        opcionesp7.add(o3op7);
        opcionesp7.add(o4op7);
        
        ArrayList<Opcion>opcionesp8=new ArrayList<Opcion>();
        opcionesp8.add(o1op8);
        opcionesp8.add(o2op8);
        opcionesp8.add(o3op8);
        opcionesp8.add(o4op8);
        
        ArrayList<Opcion>opcionesp9=new ArrayList<Opcion>();
        opcionesp9.add(o1op9);
        opcionesp9.add(o2op9);
        opcionesp9.add(o3op9);
        opcionesp9.add(o4op9);
        
        ArrayList<Opcion> opcionesp10=new ArrayList<Opcion>();
        opcionesp10.add(o1op10);
        opcionesp10.add(o2op10);
        opcionesp10.add(o3op10);
        opcionesp10.add(o4op10);
        
        
        Pregunta p1=new Pregunta("¿Deporte de 11 Jugadores?", opciones);
        Pregunta p2=new Pregunta("¿Deporte de 5 Jugadores?", opcionesp2);
        Pregunta p3=new Pregunta("¿En que deporte se anota un TouchDown?",opcionesp3);
        Pregunta p4=new Pregunta("¿A que deporte se le demonia El deporte blanco?",opcionesp4);
        Pregunta p5=new Pregunta("¿Deporte que se gana haciendo mayor puntos en 18 hoyos?",opcionesp5);
        Pregunta p6=new Pregunta("¿Cuanto dura un partido de futbol?",opcionesp6);
        Pregunta p7=new Pregunta("¿Equipo Europeo con mas Champions ganadas?",opcionesp7);
        Pregunta p8=new Pregunta("¿Ganador del mundial 2014?",opcionesp8);
        Pregunta p9=new Pregunta("¿Equipo Mexicano con mas titulos?",opcionesp9);
        Pregunta p10=new Pregunta("¿Apodo de Javier Hernandez?",opcionesp10);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
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

    public static float calificacion(Pregunta p, JRadioButton[]radios){
     boolean respuesta=false;
       float calificacion=0;
         String seleccion="";
         for(JRadioButton radio:radios){
             if(radio.isSelected()){
                 seleccion= radio.getText();
             }
         }
         for(Opcion o:p.getOpciones()){
             if(o.isEstatus()){
                 if(o.getTitulo().equals(seleccion))respuesta=true;
                 calificacion+=1;
             }
         }  
         return calificacion;
     }
    
 } 
    

