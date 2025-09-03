package com.example.utils;

// Greeter.java
public class Greeter {
    private String name;


    public Greeter(String name) {
        this.name = name;
    }


    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
}