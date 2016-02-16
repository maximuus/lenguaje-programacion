/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo8.inputoutput;

import java.net.*;
import java.io.*;

public class MiPrimerConexion {
    public static void main(String[] args)throws Exception {
        //Primero vamos a usar una clase: URL
         URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
          HttpURLConnection con=(HttpURLConnection) url.openConnection();
           InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        while(reader.readLine()!=null){
        renglones++;
        if(reader.readLine().contains("Current Conditions as of")||renglones==100){
        System.out.println(reader.readLine());
            }
    }
     //String hola="<td width=class summary_data>21.2 C</td>";          
     //int indice1= hola.indexOf("summary_data");
     //int indice2= hola.indexOf("</td>");
     //String nuevo=hola.substring (indice1+12,indice2);
        //System.out.println(nuevo);
        boolean encontrado=false;
    String[] temperatura=new String[5];
    while(reader.readLine()!=null){
        String renglonActual=reader.readLine();
        if(renglonActual.contains("Outside Temp</td>")){
            encontrado=true;
            System.out.println("Si existe el renglon");
        }
    }
      
// System.out.println("Numero de renglones: "+renglones);
    }
    
    
}
