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
public class Shape implements IShape{
    
    protected Point point_one;
    protected Point point_two;

    public Shape(Point point_one, Point point_two) {
        this.point_one = point_one;
        this.point_two = point_two;
    }
    
    
    @Override
    public void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
