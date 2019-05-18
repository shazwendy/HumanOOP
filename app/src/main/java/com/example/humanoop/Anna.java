package com.example.humanoop;

import android.util.Log;

public class Anna extends Human {

    public Anna(String name, int age, int weight) {
        super(name, age, weight);
    }

    private int height ;

    public Anna(String name, int age, int weight, int height) {
        super(name, age, weight);
        this.height = height;
    }
    public void eat (){
        Log.d("Anna", "I am eating");
    }

    public int size(int increment, int weight){
        weight = weight + 2;
        return weight;
    }



}
