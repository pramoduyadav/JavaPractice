package com.company.collections.singlylinkedlist;

public class MySingleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T element) {

        Node<T> nd = new Node<>();
        nd.setValue(element);

        if(head == null) {
            head = nd;
            tail = nd;
        } else {
            tail.setNextRef(nd);
            tail = nd;
        }
    }
}



class Node<T> implements Comparable<T> {

    private T value;
    private Node<T> nextRef;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextRef() {
        return nextRef;
    }

    public void setNextRef(Node<T> nextRef) {
        this.nextRef = nextRef;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}