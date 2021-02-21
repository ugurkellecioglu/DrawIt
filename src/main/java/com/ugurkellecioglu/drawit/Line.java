/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author ugur
 */
public class Line extends Shape{

    public Line(Point point_one, Point point_two) {
        super(point_one, point_two);
    }

    public Line() {
    }
    
    @Override
    public void paint(Graphics g){
        
        g.drawLine((int) point_one.getX(), (int) point_one.getY(), (int) point_two.getX(), (int) point_two.getY());
    }
    
    
}
