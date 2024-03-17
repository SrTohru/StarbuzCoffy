/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Domain.Player;
import Graph.Edge;
import Graph.Node;

/**
 *
 * @author HP 240 G8
 */
public interface iEdgeBuilder {
    
    
 
    public void setNodes(Node beginning, Node ending);
    public void setPlayer(Player player);
    public Edge getProduct();
    public void reset();
    
}