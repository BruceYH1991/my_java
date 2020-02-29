package linkList;

public class LinkList02 extends LinkList {
    Node last;

    LinkList02 () {
    }


    public LinkList02 (Node node) {
        super(node);
        this.last = node;
    }

    public static void main (String[] args) {
        Node n1 = new Node(1);
        LinkList02 l2 = new LinkList02(n1);

        l2.addHead(new Node(2));
        l2.addHead(new Node(3));
        l2.addHead(new Node(4));
        System.out.println("last is: " + l2.last.getElem());
        l2.addLast(new Node(5));
        l2.addLast(new Node(6));
        System.out.println("last is: " + l2.last.getElem());
        System.out.println(l2.length);
        l2.dropLast();
        System.out.println("last is: " + l2.last.getElem());
        l2.print();
        System.out.println(l2.length);
    }

    public void addLast (Node node) {
        Node lastSecondNode = last;
        lastSecondNode.setNext(node);
        last = node;
        length++;
    }

    public int dropLast () {
        int result = 0;
        if (length > 0) {
            result = last.getElem();
            Node index = head;
            while (index.getNext() != last) {
                index = index.getNext();
            }
            last = index;
            index.setNext(null);
            length--;
        } else {
            System.out.println("Con't drop node in a null LinkList1");
        }

        return result;
    }

}
