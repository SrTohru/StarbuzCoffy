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
public interface iGraphManager {
    
    public void joinHorizontalNodes(Node nodeBeggining, Node nodeEnding);
    public void joinVerticalNodes(Node nodeBeggining, Node nodeEnding);

}
