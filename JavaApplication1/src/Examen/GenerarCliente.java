/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import javax.swing.JOptionPane;

/**
 *
 * @author T-101
 */
public class GenerarCliente {
  
  public static Cliente[]ObtenerCliente(){
      
      Cliente clientes[]=new Cliente[3];
      clientes[0]=new Cliente("Ana", "Lopez", 21, 20000,new direccion("sur 11", 14, "Ecatepunk"));
      clientes[1]=new Cliente("Pedro","Montes",25, 21000,new direccion("sur 40", 28, "NezaYork"));
      clientes[2]=new Cliente("Laura","Galvan",26, 22000,new direccion("sur 20", 30, "Arabronx"));
      
      for(int i=0; i<clientes.length;i++){
          
      
          
      JOptionPane.showMessageDialog(null,"Nombre: "+clientes[i].getNombre()+
              "\n Apellido Paterno:"+clientes[i].getaPaterno()+
              "\n Edad:" +clientes[i].getEdad()+
              "\n Sueldo: "+clientes[i].getSueldo()+
              "\n Direccion"+"\n Calle"+clientes[i].getDireccion().getCalle()+
              "\n Nunmero:" +clientes[i].getDireccion().getNumero()+
              "\n Municipio:"+clientes[i].getDireccion().getMunicipio());
      
      //Ajustamos los nombres
      //clientes[0].setNombre("Ana");
      //clientes[1].setNombre("Pedro");
     // clientes[2].setNombre("Laura");
      
      //direccion d1=new direccion();
      //d1.setCalle("sur 11");
      //d1.setMunicipio("Ecatepec");
      //d1.setNumero(20);
      //clientes[0].setDireccion(d1);
      
  
      
      }
      return clientes;
}
    
    
    
}
