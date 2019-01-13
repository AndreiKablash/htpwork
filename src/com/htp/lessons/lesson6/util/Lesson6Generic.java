package com.htp.lessons.lesson6.util;

public class Lesson6Generic<K extends Number,V> {
    private K id;
    private V value;

    public Lesson6Generic() {
    }

    public Lesson6Generic(K id, V value) {
        this.id = id;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public void setValue(V value) {
        this.value = value;
    }
   /* public void genericMethod(K compareValue){
        System.out.println(this.id.byteValue() == compareValue.byteValue());
    }*/
    public void genericMethod(Lesson6Generic<?,?>compareValue){
        System.out.println(this.id.byteValue() == compareValue.getId().byteValue());
    }
}
