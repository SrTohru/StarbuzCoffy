/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.itson.graphicstest;

/**
 *
 * @author HP 240 G8
 */
public class GraphicsTest {

    public static void main(String[] args) {

        GameScreen view = new GameScreen();
        Controller controller = new Controller(view);
        view.setController(controller);
        view.start();

    }
}
