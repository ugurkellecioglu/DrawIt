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
        setBackground(Color.red);

    }
    public void paintComponent(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillOval(x,y,10,10);
    }
    public void paintSquare(Graphics g, Point p1, Point p2) {
        g.setColor(Color.BLUE);
        //we have already x and y so need to calculate w, h
        //g.fillRect(x,y, w, h);
        double w = Math.abs(p2.getX() - p1.getX());
        double h = Math.abs(p2.getY() - p1.getY());
        if(p2.getX() > p1.getX()){
            g.fillRect((int) p1.getX(), (int) p2.getX(), (int) w, (int) h);
        }
        else if(p1.getX() > p2.getX() && p1.getY() > ){
            g.fillRect((int) p2.getX(), (int) p1.getY(), (int) w, (int) h);
        }
    }
}
