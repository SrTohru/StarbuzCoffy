/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package board;

import Builder.NodeBuilder;
import Graph.Node;
import java.util.List;

/**
 *
 * @author HP 240 G8
 */
public class Board {

    private Square[][] boardArray;
    private List<Node> nodeList;
    private NodeBuilder nodeBuilder = new NodeBuilder();

    public void createSmallBoard() {

        createSmallBoardArray();
        createSmallBoardGraph();
    }

    public void createSmallBoardArray() {
        boardArray = new Square[5][5];

        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                boardArray[i][j] = new Square();
            }
        }
    }

    public void createSmallBoardGraph() {

        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                nodeBuilder.setID();
                nodeList.add(nodeBuilder.getProduct());
                nodeBuilder.reset();
            }
        }

        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[0].length; j++) {
                //I = X Coords
                //J = Y Coords
                //X+4Y+1 = Index
                Node tempNode = nodeList.get(i + 4 * j + 1);

                //Sets then upper node to null if the tempNode belongs to the first row
                if (i == 0) {
                    tempNode.setUpperNode(null);
                    //i+2*j+1 gives the index of the item in the row below
                    tempNode.setDownNode(nodeList.get(i + 2 * j + 1));
                } else {
                    //Sets then down node to null if the tempNode belongs to the last row
                    if (i == boardArray.length - 1) {
                        tempNode.setDownNode(null);
                        //i+3*j+1 gives the index of the item in the upper row
                        tempNode.setUpperNode(nodeList.get(i + 3 * j + 1));
                    } else {
                        //i+3*j+1 gives the index of the item in the upper row
                        tempNode.setUpperNode(nodeList.get(i + 3 * j + 1));
                        //i+2*j+1 gives the index of the item in the row below
                        tempNode.setDownNode(nodeList.get(i + 2 * j + 1));
                    }

                    //Sets then Left node to null if the tempNode belongs to the first column
                    if (j == 0) {
                        tempNode.setLeftNode(null);
                        //i+4*j+2 gives the index of the previous item
                        tempNode.setRightNode(nodeList.get(i + 4 * j + 2));
                    } else {
                        //Sets then Right node to null if the tempNode belongs to the last column
                    }
                    if (j == boardArray.length - 1) {
                        tempNode.setRightNode(null);
                        //i+4*j gives the index of the previous item
                        tempNode.setLeftNode(nodeList.get(i + 4 * j));
                    } else {
                        //i+4*j gives the index of the previous item
                        tempNode.setLeftNode(nodeList.get(i + 4 * j));
                        //i+4*j+2 gives the index of the previous item
                        tempNode.setRightNode(nodeList.get(i + 4 * j + 2));
                    }
                }
                nodeList.set(i + 4 * j + 1, tempNode);
            }
        }
    }
    
    
    
}