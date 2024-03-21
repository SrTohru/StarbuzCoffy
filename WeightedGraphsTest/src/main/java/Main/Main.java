/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Domain.Player;
import Graph.Edge;
import Graph.Node;
import Iterators.DefaultIterator;
import board.Board;
import board.Square;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP 240 G8
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Board board = new Board();

        board.createSmallBoard();
        List<Node> nodeList = board.getBoardNodes();
        Square[][] boardArray = board.getBoardArray();

        System.out.println("------------------------------------------------------");
        System.out.println(nodeList);
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < boardArray.length; i++) {
            System.out.println();
            for (int j = 0; j < boardArray[0].length; j++) {
                if (j != 0) {
                    System.out.print("---");
                }
                System.out.print("ID:" + nodeList.get(j + boardArray.length * i).getId());
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");



        System.out.println("RIGHT:\n");
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                System.out.println();
                System.out.println(nodeList.get(j + boardArray.length * i));
                System.out.println(nodeList.get(j + boardArray.length * i).getRightEdge());
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Left:\n");
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                System.out.println();
                System.out.println(nodeList.get(j + boardArray.length * i));
                System.out.println(nodeList.get(j + boardArray.length * i).getLeftEdge());
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("UP:\n");
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                System.out.println();
                System.out.println(nodeList.get(j + boardArray.length * i));
                System.out.println(nodeList.get(j + boardArray.length * i).getUpperEdge());
                System.out.println();
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Down:\n");
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                System.out.println();
                System.out.println(nodeList.get(j + boardArray.length * i));
                System.out.println(nodeList.get(j + boardArray.length * i).getDownEdge());
            }
        }
        System.out.println("------------------------------------------------------");
        DefaultIterator iterator = new DefaultIterator();
        iterator.setStartingNode(nodeList.get(13));
        
        //System.out.println(nodeList.get(1).getLeftEdge());
        
        Player hinojosa = new Player("Hinojosa");
        Player martin = new Player("Martin");
        Player chely = new Player("Chely");
        
        nodeList.get(13).getRightEdge().setPlayer(hinojosa);
        nodeList.get(14).getUpperEdge().setPlayer(hinojosa);
        nodeList.get(9).getLeftEdge().setPlayer(hinojosa);
        nodeList.get(8).getDownEdge().setPlayer(hinojosa);
        
        nodeList.get(13).getUpperEdge().setPlayer(martin);
        nodeList.get(8).getLeftEdge().setPlayer(martin);
        nodeList.get(7).getDownEdge().setPlayer(martin);
        nodeList.get(12).getRightEdge().setPlayer(martin);
        
        nodeList.get(13).getLeftEdge().setPlayer(chely);
        nodeList.get(12).getDownEdge().setPlayer(chely);
        nodeList.get(17).getRightEdge().setPlayer(chely);
        nodeList.get(18).getUpperEdge().setPlayer(chely);
       
        nodeList.get(13).getDownEdge().setPlayer(chely);
        nodeList.get(18).getRightEdge().setPlayer(hinojosa);
        nodeList.get(19).getUpperEdge().setPlayer(martin);
        nodeList.get(14).getLeftEdge().setPlayer(hinojosa);
                
        
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
        
    }

}
