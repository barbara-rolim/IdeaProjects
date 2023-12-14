package DynamicContainers;

import java.util.Iterator;

public class DynamicArray<E> implements Iterable<E> {

    private E[] backbone;
    private int size;

    public DynamicArray() {
        backbone = (E[]) new Object[2];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void remove(E objectToRemove) {
        int index = indexOf(objectToRemove);
        if (index == -1) {
            return;
        }
        for (int i = index; i < size - 1; i++) {
            backbone[i] = backbone[i + 1];
        }
        backbone[--size] = null;
        // check if array can shrink
        checkShrink();
    }

    private void checkShrink() {
        if (backbone.length == size * 2 - 1) { // 10
            shrinkArray();
        }
    }

    public int indexOf(E objectToRemove) {
        for (int i = 0; i < size; i++) {
            if (objectToRemove.equals(backbone[i])) {
                return i;
            }
        }
        return -1;
    }

    private void shrinkArray() {
        E[] tempArray = (E[]) new Object[backbone.length / 2];
        // copy on to the other
        System.arraycopy(backbone, 0, tempArray, 0, size);
        backbone = tempArray;
    }

    public void add(E objectToAdd) {
        backbone[size++] = objectToAdd;
        checkGrow();
    }

    private void checkGrow() {
        if (size == backbone.length) {
            doubleArray();
        }
    }

    private void doubleArray() {
        E[] tempArray = (E[]) new Object[backbone.length * 2];
        // copy on to the other
        System.arraycopy(backbone, 0, tempArray, 0, size);
        backbone = tempArray;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(backbone[i]);
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return backbone[counter++];
            }
        };
    }
}