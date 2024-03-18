/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package board;

import Builder.EdgeBuilder;
import Builder.NodeBuilder;
import Graph.Node;
import Utilities.GraphManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP 240 G8
 */
public class Board {

    private Square[][] boardArray;
    private List<Node> nodeList= new ArrayList();
    private NodeBuilder nodeBuilder = new NodeBuilder();
    private GraphManager graphManager = new GraphManager();
    private EdgeBuilder edgeBuilder = new EdgeBuilder();

    

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
                    //i+2*j+1 gives the index of the item in the row below
                    graphManager.joinVerticalNodes(null, nodeList.get(i + 2 * j + 1));

                } else {
                    //Sets then down node to null if the tempNode belongs to the last row
                    if (i == boardArray.length - 1) {
                        graphManager.joinVerticalNodes(nodeList.get(i + 3 * j + 1), null);
                        //i+3*j+1 gives the index of the item in the upper row
                    } else {
                        //i+3*j+1 gives the index of the item in the upper row
                        //i+2*j+1 gives the index of the item in the row below
                        graphManager.joinVerticalNodes(nodeList.get(i + 3 * j + 1), nodeList.get(i + 4 * j + 1));
                    }
                }
                //Sets then Left node to null if the tempNode belongs to the first column
                if (j == 0) {
                    //i+4*j+2 gives the index of the previous item
                    graphManager.joinHorizontalNodes(null, nodeList.get(i + 4 * j + 2));
                } else if (j == boardArray.length - 1) {
                    //Sets then Right node to null if the tempNode belongs to the last column

                    graphManager.joinHorizontalNodes(nodeList.get(i + 4 * j), null);

                } else {
                    //i+4*j gives the index of the previous item
                    //i+4*j+2 gives the index of the previous item
                    graphManager.joinHorizontalNodes(nodeList.get(i + 4 * j), nodeList.get(i + 4 * j + 2));
                }
                //nodeList.set(i + 4 * j + 1, tempNode);
            }

        }
    }
    
    public List getBoardNodes(){
        return nodeList;
    }
    
    public Square[][] getBoardArray(){
        return boardArray;
    }
    
}
