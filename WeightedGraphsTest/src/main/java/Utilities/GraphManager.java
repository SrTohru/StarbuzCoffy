/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Builder.NodeBuilder;
import Domain.Player;
import Graph.Edge;
import Graph.Node;

/**
 *
 * @author HP 240 G8
 */
public class GraphManager {
    
    NodeBuilder nodeBuilder = new NodeBuilder();
    
    public void entangleNodes(Node begginingNode, Node endingNode, Player player){
        Edge edge= new Edge(player, begginingNode, endingNode);
    }
    
    
    
}
