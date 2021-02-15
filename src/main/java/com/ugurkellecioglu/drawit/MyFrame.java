/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author ugur
 */
public class MyFrame extends JFrame implements MouseListener{

    private final MyPanel myPanel;
    private final Controller controller;
    
    private boolean square = false;
    public MyFrame() {
        
        controller = new Controller();
        setTitle("Draw It");
        setBounds(0, 0, 1000, 1000);
        setVisible(true);
        setLocationRelativeTo(null);
        myPanel = new MyPanel();
        this.getContentPane().add(myPanel);
        myPanel.addMouseListener(new MouseAdapter() {
            boolean check = true;

            @Override
            public void mousePressed(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                if(controller.squareBoolean){
                    controller.getSquarePoints().add(p);
                    
                
                }
            }
           
            @Override
            public void mouseReleased(MouseEvent e){
                Point p  = new Point(e.getX(), e.getY());
                System.out.println(p);
                if(controller.squareBoolean){
                    controller.getSquarePoints().add(p);
                    if(controller.getSquarePoints().size() == 2){
                        myPanel.paintSquare(myPanel.getGraphics(), controller.getSquarePoints().get(0), controller.getSquarePoints().get(1));
                        System.out.println(controller.getSquarePoints().get(0) + " " + controller.getSquarePoints().get(1));
                        controller.getSquarePoints().remove(0);
                        controller.getSquarePoints().remove(0);
                    }
                }
                
            }
            
        });
        
        myPanel.add(controller.getSquare());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
