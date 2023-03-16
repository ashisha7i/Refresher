package com.rakhi.service;

public class NewGreeter extends GreeterService {
    @Override
    public String greet() {
        return "New Hello";
    }

    public String greet(String name){
        super.greet();
        return "Hello " + name;
    }
}
