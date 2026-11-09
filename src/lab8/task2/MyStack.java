package lab8.task2;

import java.util.ArrayList;

public class MyStack {
    private final ArrayList<Comparable> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Comparable peek() {
        return list.get(getSize() - 1);
    }

    public Comparable pop() {
        Comparable o = peek();
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Comparable o) {
        list.add(o);
    }

    public void sort() {
        list.sort(null);
    }

    @Override
    public String toString() {
        return "стек: " + list;

    }
}
