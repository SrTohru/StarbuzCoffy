/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Graph.Edge;
import Graph.Node;
import interfaces.iNodeBuilder;

/**
 *
 * @author HP 240 G8
 */
public class NodeBuilder implements iNodeBuilder{
    
    private Node product;
    private int id;

    public NodeBuilder() {
        id=0;
    }
    
    @Override
    public void setUpperEdge(Edge edge) {
        product.setUpperEdge(edge);
    }

    @Override
    public void setDownEdge(Edge edge) {
        product.setDownEdge(edge);
    }

    @Override
    public void setLeftEdge(Edge edge) {
        product.setLeftEdge(edge);
    }

    @Override
    public void setRightEdge(Edge edge) {
        product.setRightEdge(edge);
    }

    @Override
    public void setID() {
        product.setId(id);
    }

    @Override
    public Node getProduct() {
        return product;
    }

    @Override
    public void reset() {
        product=new Node();
    }
}
