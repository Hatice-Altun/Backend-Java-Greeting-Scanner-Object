package com.altun.Greeting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Greeting with Scanner object

        System.out.println("What's your name?");
        Scanner userInteraction = new Scanner(System.in);
        String userName = userInteraction.next();

        System.out.println("Hello " + userName);
        System.out.println("It's nice to see you here!");
    }
}
