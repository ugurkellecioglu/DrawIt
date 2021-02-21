/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author ugur
 */
public class Circle extends Shape{
    
    private double HEIGHT, WIDTH;
    public Circle() {
        
    }
    public Circle(Point point_one, Point point_two) {
        super(point_one, point_two);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        //we have already x and y so need to calculate w, h
        //g.fillRect(x,y, w, h);
        WIDTH = Math.abs(point_two.getX() - point_one.getX());
        HEIGHT = Math.abs(point_two.getY() - point_one.getY());
        if(point_two.getX() > point_one.getX() && point_two.getY() > point_one.getY()){
            g.fillOval((int) point_one.getX(), (int) point_one.getY(), (int) WIDTH, (int) HEIGHT);
        }
        else if(point_one.getX()< point_two.getX() && point_one.getY()> point_two.getY()){
            g.fillOval((int) point_one.getX(), (int) point_two.getY(), (int) WIDTH, (int) HEIGHT);
        }
        else if(point_one.getX() > point_two.getX() && point_one.getY() < point_two.getY()){
            g.fillOval((int) point_two.getX(), (int) point_one.getY(), (int) WIDTH, (int) HEIGHT);
        }
        else{
            g.fillOval((int) point_two.getX(), (int) point_two.getY(), (int) WIDTH, (int) HEIGHT);
        }

    }
    
    
}
