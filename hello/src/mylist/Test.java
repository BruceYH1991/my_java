package mylist;

public class Test {
    public static void main (String[] args) {
        Father fa = new Father("father");
        fa.print();
        C1 ch = new C1("C1");
        ch.seta(11);
        ch.setb(22);
        ch.setc(33);
        ch.print();
        fa.print();
    }
}


class Father {
    public int a = 1;
    int b = 2;
    private int c = 3;
    String str;

    public Father (String str) {
        this.str = str;
    }

    public void seta (int a) {
        this.a = a;
    }

    public void setb (int b) {
        this.b = b;
    }

    public void setc (int c) {
        this.c = c;
    }

    public void print () {
        System.out.println("=============================");
        System.out.println(str);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("=============================");
    }
}

class C1 extends Father {
    C1 (String str) {
        super(str);
    }
}



