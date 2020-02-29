package mylist;

import java.util.Arrays;

public class ArrayList {
    private int size;
    private int[] array;
    private static int MAX = 10;

    public ArrayList () {
        array = new int[MAX];
    }

    public ArrayList (int max) {
        MAX = max;
        array = new int[max];
    }

    public static void main (String[] args) {
        ArrayList arr = new ArrayList(20);
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        arr.add(1);
        arr.add(2);
        arr.print();
        System.out.println(arr.size);
        System.out.println(arr.getMAX());
        arr.setIndex(3, 30);
        arr.insertIndex(4, 40);
        arr.print();
        System.out.println(arr.size);
        int drop = arr.dropIndex(4);
        System.out.println(drop);
        arr.printAll();
        System.out.println(arr.size);
    }

    public void add (int num) {
        if (size < MAX) {
            array[size] = num;
            size++;
        } else {
            MAX = MAX + (MAX >> 1);
            int[] array_new;
            array_new = Arrays.copyOf(array, MAX);
            array = array_new;
            array[size] = num;
            size++;
        }
    }

    public void print () {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.println("]");
    }

    public void printAll () {
        System.out.println(Arrays.toString(array));
    }

    public int getMAX () {
        return MAX;
    }

    public int getIndex (int index) {

        if (index >= 0 && index <= size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException(size);
        }
    }

    public void setIndex (int index, int num) {
        if (index >= 0 && index <= size) {
            array[index] = num;
        } else {
            throw new IndexOutOfBoundsException(size);
        }
    }

    public void insertIndex (int index, int num) {
        if (index >= 0 && index <= size) {

            if (size < MAX) {
                size++;
            } else {
                MAX = MAX + (MAX >> 1);
                int[] array_new;
                array_new = Arrays.copyOf(array, MAX);
                array = array_new;
                size++;
            }

//            int [] newArray = new int[MAX];
//            System.arraycopy(array, 0, newArray, 0, index);
//            newArray[index] = num;
//            System.arraycopy(array, index, newArray, index+1, size-index);
//            array = newArray;
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = num;
        } else {
            throw new IndexOutOfBoundsException(size);
        }
    }

    public int dropIndex (int index) {
        if (index >= 0 && index <= size) {
            int result = array[index];
            System.arraycopy(array, index, array, index - 1, size - index);
            size--;
            return result;
        } else {
            throw new IndexOutOfBoundsException(size);
        }
    }


}

