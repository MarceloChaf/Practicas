/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.warfie.pruebagrafica;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


/**
 *
 * @author Marcelo
 */
class miVentana extends JFrame{
    
    
    public miVentana(){
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
 }
    
}
