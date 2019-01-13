package com.htp.lessons.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        CollectionEntry test1 = new CollectionEntry("TestSet", 0L);
        CollectionEntry test2 = new CollectionEntry("TestSet1", 1L);
        CollectionEntry test3 = new CollectionEntry("TestSet2", 2L);
        CollectionEntry test4 = new CollectionEntry("TestSet3", 3L);
        CollectionEntry test5 = null;

        Dog anyDog = new Dog("1", 1);
        Dog anyDog1 = new Dog("1", 3);
        Dog anyDog2 = new Dog("3", 2);

        Set<CollectionEntry> hashSet = new HashSet<>();
        Set<CollectionEntry> treeSet = new TreeSet<>(new CollectionNoteComparator());
        SortedSet<Dog> dogSet = new TreeSet<>();
        Set<CollectionEntry> linkedHashSet = new LinkedHashSet<>();

        //ArrayList
        ArrayList<CollectionEntry> arrayList = new ArrayList<>();
        arrayList.add(test1);
        arrayList.add(test2);
        arrayList.add(test3);
        arrayList.add(test4);
        //System.out.println(arrayList.get(6));
        // System.out.println(arrayList.get(-1));
        System.out.println(arrayList.get(2));
        for (CollectionEntry collectionEntry : arrayList) {
            System.out.println(collectionEntry);
        }
        arrayList.indexOf(test1);

        //LinkedList
        LinkedList<CollectionEntry> linkedList = new LinkedList<>();
        linkedList.add(test1);
        linkedList.add(test2);
        linkedList.add(test3);
        linkedList.add(test4);

        //Map
        Map<String, Dog> dogMap = new HashMap<>();
        Map<String, Dog> dogTreeMap = new TreeMap<>();
        Map<String, Dog> dogLinkedHashMap = new LinkedHashMap<>();

        Dog dog = new Dog("Dog1 Dog", 10);
        Dog dog1 = new Dog("Dog1 Dog", 12);
        Dog dog2 = new Dog("Dog2 Dog", 13);
        Dog dog3 = new Dog("Dog3 Dog", 4);

        dogMap.put(dog.getName(), dog);
        dogMap.put(dog1.getName(), dog1);
        dogMap.put(dog2.getName(), dog2);
        dogMap.put(dog3.getName(), dog3);
        for (Map.Entry<String, Dog> stringDogEntry : dogMap.entrySet()) {
            System.out.println(" Name: " + stringDogEntry.getKey() + ". All info: " +
                    stringDogEntry.getValue());
        }

        //add elements for hashSet
        hashSet.add(test1);
        hashSet.add(test2);
        hashSet.add(test3);
        //add elements for treeSet
        treeSet.add(test1);
        treeSet.add(test4);
        treeSet.add(test2);
        treeSet.add(test3);
        //add new dog
        dogSet.add(anyDog);
        dogSet.add(anyDog2);
        dogSet.add(anyDog1);
        //add new linkedHashSet
        linkedHashSet.add(test1);
        linkedHashSet.add(test2);
        linkedHashSet.add(test4);
        linkedHashSet.add(test3);
        linkedHashSet.add(test5);

        // if hashSet
        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
        //if treeSet
        if (treeSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
        System.out.println("Is test1 object contains in hashSet" + hashSet.contains(test1));

        //for hashSet
        for (CollectionEntry element : hashSet) {
            System.out.println(element);
        }
        System.out.println("HashSet size = " + hashSet.size());

        //for treeSet
        for (CollectionEntry element : treeSet) {
            System.out.println(element);
        }
        System.out.println("HashSet size = " + treeSet.size());
        //for  dogSet
        /*for(Dog dog: dogSet){
            System.out.println(dog);
        }
        System.out.println(dogSet.contains(anyDog));
        //for linkedSet
        for(CollectionEntry element: linkedHashSet){
            System.out.println(element);
        }
        //System.out.println(linkedHashSet.contains(test1));
        */
    }
}


