/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP 240 G8
 */
public class Controller implements ActionListener {
    
        Model model;
        View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Add")){
            
            view.setOperation("+");
            double num1 = view.getFirstNumber();
            double num2 = view.getSecondNumber();
            double result= model.add(num1, num2);
            view.writteResult(String.valueOf(result));
            
        } else if (e.getActionCommand().equals("Substract")){
            
            view.setOperation("-");
            double num1 = view.getFirstNumber();
            double num2 = view.getSecondNumber();
            double result= model.substract(num1, num2);
            view.writteResult(String.valueOf(result));
        }
    }   
}