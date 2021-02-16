/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author ugur
 */
public class Controller implements ActionListener{
    
    private JButton square;
    private boolean squareBoolean = false;
    
    
    private ArrayList<Point> squarePoints;

    public Controller(){
        square = new JButton();
            squarePoints = new ArrayList<Point>();


        square.addActionListener(((ActionEvent e) -> {
            squareBoolean = true;

        }));
        square.setText("SQUARE");
        square.setBounds(0, 0, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getSquare() {
        return square;
    }

    public void setSquare(JButton square) {
        this.square = square;
    }

    public boolean isSquareBoolean() {
        return squareBoolean;
    }

    public void setSquareBoolean(boolean squareBoolean) {
        this.squareBoolean = squareBoolean;
    }

    public ArrayList<Point> getSquarePoints() {
        return squarePoints;
    }

    public void setSquarePoints(ArrayList<Point> squarePoints) {
        this.squarePoints = squarePoints;
    }



    
}
