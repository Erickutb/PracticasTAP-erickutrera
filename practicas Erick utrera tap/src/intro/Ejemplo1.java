/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class Ejemplo1 {
    public static void main(String args[]){
        
        JFrame miframe = new JFrame("Ejemplo1");
        JButton boton = new JButton("Boton");
        
        miframe.setSize(300, 200);
        miframe.add(boton);
        miframe.setVisible(true);
        //miframe.pack();
        
        MiListener l = new MiListener();
        
        boton.addActionListener(l);
                
    }
            
    
}

class MiListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola mundo");
    }
    
}