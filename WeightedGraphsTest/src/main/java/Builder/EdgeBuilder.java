/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Domain.Player;
import Graph.Edge;
import Graph.Node;
import interfaces.iEdgeBuilder;

/**
 *
 * @author HP 240 G8
 */
public class EdgeBuilder implements iEdgeBuilder{

    private Edge product;
    
    
    @Override
    public void setNodes(Node beggining, Node ending) {
        product.setBegginingNode(beggining);
        product.setEndingNode(ending);
    }

    @Override
    public void setPlayer(Player player) {
        product.setPlayer(player);
    }
    @Override
    public Edge getProduct() {
        return product;
    }

    @Override
    public void reset() {
        product = new Edge();
    }


    
}
