package lab7.task1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty())
            throw new StackEmptyException();

        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = peek();
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        if (search(o) != -1) {
            throw new DuplicateElementException(o);
        }
        list.add(o);
    }

    public int search(Object o) {
        if (o == null) {
            for (int i = list.size() - 1; i >= 0; i--)
                if (list.get(i) == null)
                    return list.size() - i;
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (o.equals(list.get(i))) {
                    return list.size() - i;
                }
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return "стек: " + list.toString();
    }
}

