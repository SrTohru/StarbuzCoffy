/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Builder.EdgeBuilder;
import Builder.NodeBuilder;
import Domain.Player;
import Graph.Edge;
import Graph.Node;
import interfaces.iGraphManager;

/**
 *
 * @author HP 240 G8
 */
public class GraphManager implements iGraphManager {
    
    EdgeBuilder edgeBuilder = new EdgeBuilder();

    @Override
    public void joinVerticalNodes(Node nodeBeggining, Node nodeEnding) {

        edgeBuilder.setNodes(nodeBeggining, nodeEnding);
        if (nodeBeggining!=null){
            nodeBeggining.setUpperEdge(edgeBuilder.getProduct());
        } 
        if (nodeEnding!=null){
            nodeEnding.setDownEdge(edgeBuilder.getProduct());
        }
    }

    @Override
    public void joinHorizontalNodes(Node nodeBeggining, Node nodeEnding) {

        edgeBuilder.setNodes(nodeBeggining, nodeEnding);
        if (nodeBeggining!=null){
            nodeBeggining.setLeftEdge(edgeBuilder.getProduct());
        }
        if (nodeEnding!=null){
            nodeEnding.setRightEdge(edgeBuilder.getProduct());
        }
    }
    
}
