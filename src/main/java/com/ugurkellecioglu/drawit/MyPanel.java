/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ugur
 */
public class MyPanel extends JPanel{
    
    public MyPanel(int height, int width, Color c){
        super();
        setBounds(0, 0, width, height);
        setBackground(c);

    }
}
