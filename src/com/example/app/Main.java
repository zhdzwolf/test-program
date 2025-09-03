package com.example.app;

import com.example.utils.Greeter;
import com.example.utils.Calculator;

// Main.java
public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("World");
        greeter.greet();


        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(10, 5);
        System.out.println("Difference: " + difference);
    }
}
