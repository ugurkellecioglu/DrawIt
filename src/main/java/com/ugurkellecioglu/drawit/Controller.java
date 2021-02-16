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
    protected boolean squareBoolean = false;
    private JButton circle;
    protected boolean circleBoolean = false;

    protected ArrayList<Point> points;

    public Controller(){
        points = new ArrayList<Point>();

        square = new JButton();
        square.addActionListener(((ActionEvent e) -> {
            squareBoolean = true;

        }));
        square.setText("SQUARE");
        square.setBounds(0, 0, 100, 100);
        
        circle = new JButton();
        circle.addActionListener(((ActionEvent e) -> {
            circleBoolean = true;

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

    public boolean isSquareBoolean() {
        return squareBoolean;
    }

    public void setSquareBoolean(boolean squareBoolean) {
        this.squareBoolean = squareBoolean;
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

    public boolean isCircleBoolean() {
        return circleBoolean;
    }

    public void setCircleBoolean(boolean circleBoolean) {
        this.circleBoolean = circleBoolean;
    }

    void addListenerToSquare(JPanel myPanel) {
        
        circleBoolean = false;
        myPanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                if(squareBoolean){
                    getPoints().add(p);
                    
                
                }
            }
           
            @Override
            public void mouseReleased(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                if(squareBoolean){
                    points.add(p);
                    if(getPoints().size() >= 2){
                        Shape square = new Square(getPoints().get(0), getPoints().get(1));
                        square.paint(myPanel.getGraphics());
                        //myPanel.paintSquare(myPanel.getGraphics());
                        points = new ArrayList<Point>();

                    }
                }
                
            }
            
        });
    }

    void addListenerToCircle(JPanel myPanel) {
        circleBoolean = false;
        myPanel.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                Point p = new Point(e.getX(), e.getY());
                if (circleBoolean) {
                    getPoints().add(p);

                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Point p = new Point(e.getX(), e.getY());
                System.out.println(p);
                if (circleBoolean) {
                    points.add(p);
                    if (getPoints().size() >= 2) {
                        Shape circle = new Circle(getPoints().get(0), getPoints().get(1));
                        circle.paint(myPanel.getGraphics());
                        //myPanel.paintSquare(myPanel.getGraphics());
                        points = new ArrayList<Point>();
                    }
                }

            }

        });
    }

    
}
