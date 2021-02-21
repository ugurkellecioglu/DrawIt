/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ugurkellecioglu.drawit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author ugur
 */
public class MyFrame extends JFrame implements MouseListener{

    private final MyPanel myPanel;
    private final Controller controller;
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private final String TITLE = "Draw It";
    
    public MyFrame() {
        
        controller = new Controller();
        setTitle(TITLE);
        setBounds(0, 0, WIDTH, HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        myPanel = new MyPanel(WIDTH, HEIGHT, Color.WHITE);

        this.setLayout(null);
        myPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.getContentPane().add(myPanel);

        
        controller.addListenerToMouse(myPanel);
        controller.addListenerUndo(myPanel, this);
        controller.addListenerColor(myPanel, this);
        
        myPanel.add(controller.getButtonSquare());
        myPanel.add(controller.getButtonCircle());
        myPanel.add(controller.getButtonLine());
        myPanel.add(controller.getButtonUndo());
        myPanel.add(controller.getButtonColors());
    }
    
    public void paint(Graphics g){
        super.paint(g);
        for(Shape s : controller.getShapes()){
            s.paint(g);
        }
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
