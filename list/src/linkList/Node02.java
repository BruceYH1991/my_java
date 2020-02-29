package linkList;

public class Node02 {
    private int elem;
    private Node02 next;
    private Node02 prev;

    public Node02 () {
    }

    public Node02 (int num) {
        this.elem = num;
    }

    public static void main (String[] args) {
        Node02 n1 = new Node02(1);
        System.out.println(n1.getElem());
        System.out.println(n1.getNext());
        System.out.println(n1.getPrev());
    }

    public Node02 getNext () {
        return next;
    }

    public void setNext (Node02 next) {
        this.next = next;
    }

    public Node02 getPrev () {
        return prev;
    }

    public void setPrev (Node02 prev) {
        this.prev = prev;
    }

    public int getElem () {
        return elem;
    }
}
