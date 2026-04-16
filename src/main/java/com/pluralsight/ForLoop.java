package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

//  Step 1: Create For Loop
        for (int i = 10; i >= 1; i--) {

//  Step 2: Print current number
            System.out.println(i);

//  Step 3: Pause for a second (1000 millisecond)
            Thread.sleep(1000);
        }
//  Step 4: Print final message after loop ends
        System.out.println("Launch!");
    }
}
