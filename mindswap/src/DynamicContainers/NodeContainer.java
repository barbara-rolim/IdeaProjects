package DynamicContainers;

import java.util.Iterator;

public class NodeContainer<T, V> implements Iterable<T> {

    private final Node<T> head;

    private int size;

    public NodeContainer() {

        head = new Node<>(null);
        size = 0;
    }


    public V addAll(V list, T object) {
        return list;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Node<T> actual = head;

            @Override
            public boolean hasNext() {
                return actual.hasNext();
            }

            @Override
            public T next() {
                actual = actual.getNext();
                return actual.getObject();
            }
        };
    }

    public void add(T objectToAdd) {
        if (objectToAdd == null) {
            throw new RuntimeException("Null not allowed");
        }
        //get the last node
        Node<T> lastNode = geLastNode();
        //create a new node
        //add new node to last node
        lastNode.setNext(new Node<>(objectToAdd));
        size++;
    }

    private Node<T> geLastNode() {
        Node<T> temp = head;
        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void remove(T objectToRemove) {
        Node<T> temp = head;
        while (temp.hasNext()) {
            if (temp.getNext().getObject().equals(objectToRemove)) {
                temp.setNext(temp.getNext().getNext());
                size--;
            }
            temp = temp.getNext();
        }
        //ciclo para remover primeiro no com numberToRemove
    }

    public void printList() {
        if (size == 0) {
            return;
        }
        Node<T> temp = head;
        while (temp.hasNext()) {
            temp = temp.getNext();
            System.out.println(temp.getObject());
        }
        // System.out.println(temp.getObject());

    }

    public int size() {
        return size;
    }


    private static class Node<T> {
        T object;
        Node<T> next;

        public Node(T object) {

            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public boolean hasNext() {
            return next != null;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}









