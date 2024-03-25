/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.graphicstest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author HP 240 G8
 */
public class BoardFrame extends JPanel {
    

    static final int cellSize=50;
    static final int columns=10;
    static final int rows=10;
    static final int circleSize=10;
    static final int originX=0;
    static final int originY=0;
    static final int smollCircleSize=4;
    
    private Color getRandomColor(){
        Color colors[] = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
        Random random = new Random();
        return (colors[random.nextInt(4)]);
    }

    private boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();

    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
//        //Beggining x, beginning y, ending x, ending y
//        for (int i=0; i<=columns; i++){
//            g.drawLine(originX+circleSize/2, originY+cellSize*i, originX-circleSize/2+cellSize*columns, originY+cellSize*i);
//        }
//
//        for (int i=0; i<=rows; i++){
//            System.out.println(originX +"\n"+ originY+(cellSize*i)+"\n"+ originX+cellSize*columns+"\n"+ originY+(cellSize*i));
//            g.drawLine(originX+cellSize*i, originY, originX+cellSize*i, originY+cellSize*columns);
//        }
//        
        g.setColor(getRandomColor());
        g.fillRect(circleSize / 2, circleSize / 2, circleSize + cellSize-circleSize, circleSize + cellSize-circleSize);
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {

                if (getRandomBoolean()) {
                    g.setColor(getRandomColor());

                    if (i != rows - 1) {
                        g.drawLine(cellSize * i + circleSize, cellSize * j + circleSize / 2, cellSize * (i + 1), cellSize * j + circleSize / 2);
                    }

                    g.setColor(getRandomColor());

                    if (j != columns - 1) {

                        g.drawLine(cellSize * i + circleSize / 2, cellSize * j + 2 * circleSize / 2, cellSize * i + circleSize / 2, cellSize * (j + 1));
                    }
                }
                g.setColor(Color.BLACK);

                g.drawOval(originX + cellSize * i, originY + cellSize * j, circleSize, circleSize);
                
                g.setColor(Color.RED);
                
                g.fillOval(originX+smollCircleSize/2 + cellSize * i, originY+smollCircleSize/2 + cellSize * j, circleSize-smollCircleSize,circleSize-smollCircleSize);
            }
        }
    }
}
