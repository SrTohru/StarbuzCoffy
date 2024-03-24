/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.graphicstest;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author HP 240 G8
 */
public class BoardFrame extends JPanel {
    
    static final int originX=0;
    static final int originY=0;
    static final int cellSize=50;
    static final int columns=5;
    static final int rows=5;


    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //Beggining x, beginning y, ending x, ending y
        
        for (int i=0; i<=columns; i++){
            System.out.println(originX +"\n"+ originY+(cellSize*i)+"\n"+ originX+cellSize*columns+"\n"+ originY+(cellSize*i));
            g.drawLine(originX, originY+cellSize*i, originX+cellSize*columns, originY+cellSize*i);
        }

        for (int i=0; i<=rows; i++){
            System.out.println(originX +"\n"+ originY+(cellSize*i)+"\n"+ originX+cellSize*columns+"\n"+ originY+(cellSize*i));
            g.drawLine(originX+cellSize*i, originY, originX+cellSize*i, originY+cellSize*columns);
        }
        
    }
    
}
