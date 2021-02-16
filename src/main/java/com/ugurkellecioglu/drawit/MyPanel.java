/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author ugur
 */
public class MyPanel extends JPanel{
    
    public MyPanel(){
        super();
        setBounds(0, 0, 1000, 1000);
        setBackground(Color.WHITE);

    }
    public void paintComponent(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillOval(x,y,10,10);
    }
    public void paintSquare(Graphics g, Point p1, Point p2) {
        
    }
}
