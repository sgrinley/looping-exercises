package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {

//  Step 1: Create a counter variable
        int count = 1;

//  Step 2: Create a While Loop (will run as long as count <= 5)
        while (count <= 5) {

//  Step 3: Print message
            System.out.println("I love Java");

//  Step 4: Increase the counter (Loop will run forever if forgotten)
            count++;

        }
    }
}
