/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package board;

import Domain.Player;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/**
 *
 * @author HP 240 G8
 */
public class Square {

    private List<Node> nodeList = new ArrayList();
    private Player player;

    public void deleteNodes(List<Node> deletedNodes) {

        if (nodeList.removeAll(deletedNodes)){
            player.getSquareList().remove(this);
        }
        
    }
}
