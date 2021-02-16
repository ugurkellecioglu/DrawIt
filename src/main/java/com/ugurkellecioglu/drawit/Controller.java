/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ugur
 */
public class Controller implements ActionListener{
    
    private JButton square;
    private JButton circle;
    protected ArrayList<Point> points;

    private Shape shape;
    public Controller(){
        points = new ArrayList<Point>();

        square = new JButton();
        square.addActionListener(((ActionEvent e) -> {
            shape = new Square();
        }));
        square.setText("SQUARE");
        square.setBounds(0, 0, 100, 100);
        
        circle = new JButton();
        circle.addActionListener(((ActionEvent e) -> {
            shape = new Circle();
        }));
        circle.setText("CIRCLE");
        circle.setBounds(0, 0, 200, 200);
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


    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> Points) {
        this.points = Points;
    }

    public JButton getCircle() {
        return circle;
    }

    public void setCircle(JButton circle) {
        this.circle = circle;
    }



    void addListenerToMouse(JPanel myPanel) {
        
        myPanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                points.add(p);
                    
                
            }
           
            @Override
            public void mouseReleased(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                    points.add(p);
                    if(getPoints().size() >= 2){
                        shape.setPoint_one(points.get(0));
                        shape.setPoint_two(points.get(1));
                        shape.paint(myPanel.getGraphics());
                        //myPanel.paintSquare(myPanel.getGraphics());
                        points = new ArrayList<Point>();

                    }
                
            }
            
        });
    }

    

    
}
