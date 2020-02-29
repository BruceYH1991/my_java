package linkList;

public class LinkList {
    Node head;
    int length = 0;

    public LinkList () {
    }

    public LinkList (Node node) {
        head = node;
        length = 1;
    }


    public static void main (String[] args) {
        Node n1 = new Node(1);
        LinkList l1 = new LinkList(n1);
        System.out.println(l1.head.getElem());
        l1.addHead(new Node(2));
//        System.out.println(l1.head.getElem());
        l1.addHead(new Node(3));
        l1.addHead(new Node(4));
        l1.addHead(new Node(5));
        l1.addLast(new Node(6));
        l1.addLast(new Node(7));
        l1.addLast(new Node(8));
        l1.addLast(new Node(9));
        l1.print();
        l1.add(3, new Node(10));

        l1.print();
        System.out.println("length: " + l1.length);
        int d3 = l1.drop(3);
        int d1 = l1.dropHead();
        int d2 = l1.dropLast();
        l1.print();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("length: " + l1.length);
    }

    public void addHead (Node node) {
        Node oldHead = head;
        head = node;
        head.setNext(oldHead);
        length++;
    }

    public int dropHead () {
        int result = head.getElem();
        if (length > 0) {
            head = head.getNext();
            length--;
        } else {
            System.out.println("Con't drop node in a null LinkList1");
        }
        return result;
    }

    public void addLast (Node node) {
        if (length > 0) {
            Node index = head;
            while (null != index.getNext()) {
                index = index.getNext();
            }
            index.setNext(node);
        } else {
            head = node;
        }
        length++;
    }

    public int dropLast () {
        int result = 0;
        if (length > 0) {
            Node index = head;
            for (int i = 1; i < length - 1; i++) {
                index = index.getNext();
            }
            result = index.getNext().getElem();
            index.setNext(null);
            length--;
        } else {
            System.out.println("Con't drop node in a null LinkList1");
        }
        return result;
    }

    public void add (int index, Node node) {
        if (length > 0) {
            if (length >= index) {
                if (index == 0) {
                    addHead(node);
                } else if (index > 0) {
                    Node head_ = head;
                    for (int i = 0; i < index - 1; i++) {
                        head_ = head_.getNext();
                    }
                    Node oldNext = head_.getNext();
                    head_.setNext(node);
                    node.setNext(oldNext);
                } else {
                    System.out.println("index mast >= 0 !");
                }
                length++;
            } else {
                System.out.println("index out of range !");
            }
        } else {
            head = node;
        }
    }

    public int drop (int index) {
        int result = 0;
        if (length > 0) {
            if (length >= index) {
                if (index == 0) {
                    dropHead();
                } else if (index > 0) {
                    Node head_ = head;
                    for (int i = 0; i < index - 1; i++) {
                        head_ = head_.getNext();
                    }
                    result = head_.getNext().getElem();
                    head_.setNext(head_.getNext().getNext());
                } else {
                    System.out.println("index mast >= 0 !");
                }
                length--;
            } else {
                System.out.println("index out of range !");
            }
        } else {
            System.out.println("if drop length mast > 0 ");
        }
        return result;
    }

    public void print () {
        Node index = head;
        System.out.print("[");
        if (length > 0) {
            while (null != index.getNext()) {
                System.out.print("" + index.getElem() + ", ");
                index = index.getNext();
            }
        }
        System.out.println("" + index.getElem() + "]");
    }
}
