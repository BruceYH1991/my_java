package linkList;

import com.sun.jdi.event.StepEvent;

public class LinkList03 {
    private Node02 head;
    private Node02 last;
    private int lenght = 0;

    public LinkList03 () {
    }

    public LinkList03 (Node02 node) {
        head = node;
        last = node;
        lenght = 1;
    }

    public static void main (String[] args) {
        Node02 n1 = new Node02(1);
        LinkList03 l1 = new LinkList03(n1);

        l1.addHead(new Node02(2));
        l1.addHead(new Node02(3));
        l1.addHead(new Node02(4));
        System.out.println(l1);
    }

    public Node02 getHead () {
        return head;
    }

    public void setHead (Node02 head) {
        this.head = head;
    }

    public Node02 getLast () {
        return last;
    }

    public void setLast (Node02 last) {
        this.last = last;
    }

    public int getLenght () {
        return lenght;
    }

    public void addHead (Node02 node) {
        Node02 oldHead = head;
        head = node;
        node.setNext(oldHead);
        oldHead.setPrev(node);
        lenght++;
    }

    public void addLast (Node02 node) {
        Node02 oldLast = last;
        last = node;
        node.setPrev(oldLast);
        oldLast.setNext(node);
        lenght++;
    }

    public int dropHead () {
        int result = 0;
        if (lenght > 0) {
            Node02 newHead = head.getNext();
            head = newHead;
            newHead.setPrev(null);
            lenght--;
        } else {
            System.out.println("Con't drop node in a null LinkList03");
        }
        return result;
    }

    public int dropLast () {
        int result = 0;
        if (lenght > 0) {
            Node02 newLast = last.getPrev();
            last = newLast;
            newLast.setNext(null);
            lenght--;
        } else {
            System.out.println("Con't drop node in a null LinkList03");
        }
        return result;
    }

    @Override
    public String toString () {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node02 index = head;
        for (int i = 0; i < lenght - 1; i++) {
            result.append(index.getElem());
            result.append(", ");
            index = index.getNext();
        }
        result.append(index.getElem());
        result.append("]");
        return result.toString();
    }

}


