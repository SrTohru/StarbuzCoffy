/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import board.Square;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP 240 G8
 */
public class Player {
    
    private String name;
    private List<Square> squareList = new ArrayList();
    

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Square> getSquareList() {
        return squareList;
    }

    public void addSquare(Square square){
        squareList.add(square);
    }
    
    public int getScore(){
        return squareList.size();
    }
    
    public void setSquareList(List<Square> squareList) {
        this.squareList = squareList;
    }
    
}
