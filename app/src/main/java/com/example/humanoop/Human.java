package com.example.humanoop;

import android.util.Log;

public class Human {

    private String name;
    private int age;
    private int weight;
    private int year;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String name() {
        return name;
    }

    public void setColor(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void eat() {

        Log.d("Human","I am eating food");
    }

    public void sleep() {
        Log.d("Human","zzzzzzzzzzzzz");
    }

    public void sleep(int hours) {
        Log.d("Human", "I am sleeping for x hours");
    }

    public void speak(String speech) {
        Log.d("Human", "I am Shazy");
    }

    public int birthday(int increment) {
        age = age + 1;
        return age;
    }
}
