/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marce.dice;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Marcelo
 */
public class BotonPulsado implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        int num=(int)(Math.random()*6)+1; 
        TextField txtField=(TextField)e.getSource();
        txtField.setText(""+num);
    }
    
}
