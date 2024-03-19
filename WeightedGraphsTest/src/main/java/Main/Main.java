/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

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

        DefaultIterator iterator = new DefaultIterator();
        iterator.setStartingNode(nodeList.get(13));

        //while (iterator.hasNext()) {
        //    System.out.println(iterator.getNext());
        //}
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                System.out.println();
                System.out.println(nodeList.get(j + boardArray.length * i));
                System.out.println(nodeList.get(j + boardArray.length * i).getRightEdge());
                System.out.println();
            }
        }

        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println("------------------------------------------------------");
    }

}
