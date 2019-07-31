package mylist02;

public class Node {
    private Node next = null;
    int elem;

    public Node (int num) {
        elem = num;
    }

    public void setNext(Node node) {
        next = node;
    }

    public Node getNext () {
        return next;
    }

    public int getElem () {
        return elem;
    }
}
