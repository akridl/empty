package com.github.akridl;

public class GreeterImpl implements Greeter {

    @Override
    public String greet(String name) {
        final String nameToGreet = name == null ? "anonymous" : name;
        return String.format("Hello %s!", nameToGreet);
    }
}
