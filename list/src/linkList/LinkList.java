package linkList;

public class LinkList {
    public Node head;
    public int length = 0;


    public void print() {
        Node index = head;
        System.out.print("[");
        if (length > 0) {
            while (null != index.getNext()) {
                System.out.print("" + index.getElem() + ", ");
                index = index.getNext();
            }
        }
        System.out.println(""+index.getElem()+"]");
    }
}
