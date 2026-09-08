package com.github.akridl;

public class Main {

    public static void main(String[] args) {
        final Greeter greeter = new GreeterImpl();
        System.out.println(greeter.greet(null));
    }
}
