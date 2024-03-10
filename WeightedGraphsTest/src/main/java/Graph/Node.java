/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author HP 240 G8
 */
public class Node {
    
    private int id;
    private Node upperNode;
    private Node downNode;
    private Node leftNode;
    private Node rightNode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getUpperNode() {
        return upperNode;
    }

    public void setUpperNode(Node upperNode) {
        this.upperNode = upperNode;
    }

    public Node getDownNode() {
        return downNode;
    }

    public void setDownNode(Node downNode) {
        this.downNode = downNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

  

}