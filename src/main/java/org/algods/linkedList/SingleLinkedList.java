package org.algods.linkedList;

public class SingleLinkedList implements Ilist{
    Node node = new Node();
    @Override
    public void insert(Integer data) {
        if(node.next == null){
            node.data = data;
        }else{
            Node newNode = new Node();
            newNode.data = data;
            node.next = newNode;
        }
    }

    @Override
    public void display() {
        Node currNode = node;
        while(currNode.next != null){
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

}
