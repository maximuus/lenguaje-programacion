/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

import java.util.ArrayList;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-101
 */
public class TestBasico extends javax.swing.JFrame {
    ArrayList<Pregunta> preguntas;
JRadioButton radios[]=new JRadioButton[4];
int numero=0;
int x=60;
    /**
     * Creates new form TestBasico
     */
    public TestBasico() {
         preguntas=GeneradorPreguntas.obtenerTodasLasPreguntas();
        initComponents();
        Thread t1=new Thread(new Runnable() {

             @Override
             public void run() {
                 while(true){
                     x--;
                     if(x<=0)dispose();
                     etiquetaReloj2.setText(""+x);
                     try{
                         Thread.sleep(1000);
                     }catch(InterruptedException e){
                         Logger.getLogger(TestBasico.class.getName()).log(Level.SEVERE,null,e);
                         
                     }
                     
                 }
                  
             }
         });
        t1.start();
        inicarTodos();

    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        etiquetaReloj = new javax.swing.JLabel();
        Pregunta = new javax.swing.JLabel();
        Radio0 = new javax.swing.JRadioButton();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        R = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        etiquetaReloj2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pregunta.setText("Pregunta");

        buttonGroup1.add(Radio0);
        Radio0.setText("jRadioButton1");

        buttonGroup1.add(Radio1);
        Radio1.setText("jRadioButton2");

        buttonGroup1.add(Radio2);
        Radio2.setText("jRadioButton3");

        buttonGroup1.add(Radio3);
        Radio3.setText("jRadioButton4");

        R.setText("Checar respuesta");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        jButton2.setText("Ir a siguiente pregunta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Radio1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(Pregunta))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(Radio0)))
                    .addComponent(Radio2)
                    .addComponent(R)
                    .addComponent(Radio3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton2)
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaReloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Pregunta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaReloj2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(Radio0)
                .addGap(18, 18, 18)
                .addComponent(Radio1)
                .addGap(18, 18, 18)
                .addComponent(Radio2)
                .addGap(18, 18, 18)
                .addComponent(Radio3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
  boolean respuesta=
          GeneradorPreguntas.checarRespuesta(preguntas.get(numero),radios);
        JOptionPane.showMessageDialog(rootPane, "Respuesta:"+respuesta);
        
    }//GEN-LAST:event_RActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        numero++;
        inicarTodos();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestBasico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pregunta;
    private javax.swing.JButton R;
    private javax.swing.JRadioButton Radio0;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etiquetaReloj;
    private javax.swing.JLabel etiquetaReloj2;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

    private void inicarTodos() {
        if(numero<preguntas.size()){
        radios[0]=Radio0;
        radios[1]=Radio1;
        radios[2]=Radio2;
        radios[3]=Radio3;
        
 
        Pregunta.setText(preguntas.get(numero).getTitulo());
        Radio0.setText(preguntas.get(numero).getOpciones().get(0).getTitulo());
        Radio1.setText(preguntas.get(numero).getOpciones().get(1).getTitulo());
        Radio2.setText(preguntas.get(numero).getOpciones().get(2).getTitulo());
        Radio3.setText(preguntas.get(numero).getOpciones().get(3).getTitulo());
        
        ArrayList<Pregunta>preguntas=GeneradorPreguntas.obtenerTodasLasPreguntas();
      
        
        Radio0.setText(preguntas.get(numero).getOpciones().get(0).getTitulo());
        Radio1.setText(preguntas.get(numero).getOpciones().get(1).getTitulo());
        Radio2.setText(preguntas.get(numero).getOpciones().get(2).getTitulo());
        Radio3.setText(preguntas.get(numero).getOpciones().get(3).getTitulo());
          
    }
    }


}