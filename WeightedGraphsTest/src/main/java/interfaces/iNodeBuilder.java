/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Graph.Edge;
import Graph.Node;

/**
 *
 * @author HP 240 G8
 */
public interface iNodeBuilder {
    
    public void setUpperNode(Node node);
    public void setDownNode(Node node);
    public void setLeftNode(Node node);
    public void setRightNode(Node node);
    public void setID();
    public Node getProduct();
    public void reset();
    
    
}
