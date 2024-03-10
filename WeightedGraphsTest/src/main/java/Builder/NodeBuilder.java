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
    public void setUpperNode(Node node) {
        product.setUpperNode(node);
    }

    @Override
    public void setDownNode(Node node) {
        product.setDownNode(node);
    }

    @Override
    public void setLeftNode(Node node) {
        product.setLeftNode(node);
    }

    @Override
    public void setRightNode(Node node) {
        product.setRightNode(node);
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
