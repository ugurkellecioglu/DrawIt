/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ugur
 */
public class Controller implements ActionListener{
    
    private JButton buttonSquare;
    private JButton buttonCircle;
    private JButton buttonLine;
    private JButton buttonUndo;
    private JButton buttonColors;
    protected ArrayList<Point> points;
    protected ArrayList<Shape> shapes;
    private Shape shape;
    public Controller(){
        points = new ArrayList<Point>();
        shapes = new ArrayList<Shape>();
        buttonSquare = new JButton();
        buttonSquare.addActionListener(((ActionEvent e) -> {
            shape = new Square();
        }));
        buttonSquare.setText("SQUARE");
        buttonSquare.setBounds(100, 50, 100, 50);
        
        buttonCircle = new JButton();
        buttonCircle.addActionListener(((ActionEvent e) -> {
            shape = new Circle();
        }));
        buttonCircle.setText("CIRCLE");
        buttonCircle.setBounds(200, 50, 100, 50);
        
        
        buttonLine = new JButton();
        buttonLine.addActionListener(((ActionEvent e) -> {
            shape = new Line();
        }));
        buttonLine.setText("LINE");
        buttonLine.setBounds(300, 50, 100, 50);
        
        buttonUndo = new JButton();
        buttonUndo.setText("UNDO");
        buttonUndo.setBounds(400, 50, 100, 50);
        
        buttonColors = new JButton();
        buttonColors.setText("COLORS");
        buttonColors.setBounds(500, 50, 100, 50);

        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getButtonSquare() {
        return buttonSquare;
    }

    public JButton getButtonCircle() {
        return buttonCircle;
    }


    public JButton getButtonLine() {
        return buttonLine;
    }


    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public JButton getButtonUndo() {
        return buttonUndo;
    }


    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public JButton getButtonColors() {
        return buttonColors;
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
                        shapes.add(shape);
                        
                        shape.paint(myPanel.getGraphics());

                        points = new ArrayList<Point>();

                    }
                
            }
            
     
            
        });
    }

    void addListenerUndo(JPanel myPanel, JFrame myFrame){
        buttonUndo.addMouseListener(new MouseAdapter(){
                @Override
            public void mousePressed(MouseEvent e){
                
                //remove from arraylist
                shapes.remove(shapes.size()-1);
                
                //paint my frame 
                myFrame.repaint();
               

            }
        });
    }

    void addListenerColor(JPanel myPanel, JFrame myFrame){
        buttonColors.addActionListener(((ActionEvent e) -> {
             MyPanel colorPanel = new MyPanel(100,100, Color.BLACK);
               colorPanel.setPreferredSize(new Dimension(100, 100));
               colorPanel.setAlignmentX(100);
                       myPanel.add(colorPanel);
                       //myFrame.repaint();

        }));
    }

    
}
