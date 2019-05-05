package com.company.exception.hashMapCreation;

public class MyHashEntry<K, V> {

    private K key;
    private V value;
    private MyHashEntry<K, V> nextEntry;

    public  MyHashEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public MyHashEntry<K, V> getNextEntry() {
        return nextEntry;
    }

    public void setNextEntry(MyHashEntry<K, V> nextEntry) {
        this.nextEntry = nextEntry;
    }

}
