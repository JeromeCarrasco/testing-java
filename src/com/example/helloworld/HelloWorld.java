package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {

    public void myPublicMethod(){
        System.out.println("This is public method.");
    }

    public static void main(String[] args) {
        System.out.println("Hello World IntelliJ !!!!");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a new number");

        int number = reader.nextInt();

        System.out.println("Your entered number = " + number);

        HelloWorld myPublicObj = new HelloWorld();

        myPublicObj.myPublicMethod();
    }
}
