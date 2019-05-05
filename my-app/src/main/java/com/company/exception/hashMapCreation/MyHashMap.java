package com.company.exception.hashMapCreation;

import com.company.collections.myhashmap.Entry;

public class MyHashMap<K, V> {

    private int DEFAULT_BUCKET_COUNT = 10;

    private MyHashEntry<K, V>[] buckets;

    public MyHashMap(){
        buckets = new MyHashEntry[DEFAULT_BUCKET_COUNT];
    }

    public MyHashMap(int capacity){
        buckets = new MyHashEntry[capacity];
    }


    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MyHashEntry<K, V> entry = buckets[bucketIndex];
        if(entry != null) {
            boolean flag = false;

            while(!flag) {
                if(entry.getKey().equals(key)) {
                    entry.setValue(value);
                    flag = true;
                } else if(entry.getNextEntry() == null) {
                    entry.setNextEntry(new MyHashEntry<>(key, value));
                    flag= true;
                }
                    else {

                    entry = entry.getNextEntry();
                }

            }


        } else {
            buckets[bucketIndex] = new MyHashEntry<K, V>(key, value);
        }

    }

    private int getBucketIndex(K key) {
        return key.hashCode() % buckets.length;
    }


}
