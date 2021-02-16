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
    
    private JButton buttonSquare;
    private JButton buttonCircle;
    private JButton buttonLine;
    private JButton buttonUndo;
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
        buttonSquare.setBounds(0, 0, 100, 100);
        
        buttonCircle = new JButton();
        buttonCircle.addActionListener(((ActionEvent e) -> {
            shape = new Circle();
        }));
        buttonCircle.setText("CIRCLE");
        buttonCircle.setBounds(0, 0, 200, 200);
        
        
        buttonLine = new JButton();
        buttonLine.addActionListener(((ActionEvent e) -> {
            shape = new Line();
        }));
        buttonLine.setText("LINE");
        buttonLine.setBounds(0, 0, 300, 200);
        
        buttonUndo = new JButton();
        
        buttonUndo.setText("UNDO");
        buttonUndo.setBounds(0, 0, 300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JButton getButtonSquare() {
        return buttonSquare;
    }

    public void setButtonSquare(JButton buttonSquare) {
        this.buttonSquare = buttonSquare;
    }

    public JButton getButtonCircle() {
        return buttonCircle;
    }

    public void setButtonCircle(JButton buttonCircle) {
        this.buttonCircle = buttonCircle;
    }

    public JButton getButtonLine() {
        return buttonLine;
    }

    public void setButtonLine(JButton buttonLine) {
        this.buttonLine = buttonLine;
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

    public void setButtonUndo(JButton buttonUndo) {
        this.buttonUndo = buttonUndo;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
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
                        //myPanel.paintSquare(myPanel.getGraphics());
                        points = new ArrayList<Point>();

                    }
                
            }
            
     
            
        });
    }

    void addListenerUndo(JPanel myPanel){
        buttonUndo.addMouseListener(new MouseAdapter(){
                @Override
            public void mousePressed(MouseEvent e){
                
                System.out.println(shapes.size());
                shapes.remove(shapes.size()-1);
                myPanel.repaint();
                for(Shape s: shapes){
                    s.paint(myPanel.getGraphics());
                    System.out.println(s.toString());
                }
                
            }
        });
    }

    

    
}
