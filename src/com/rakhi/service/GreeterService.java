package com.rakhi.service;

import java.util.concurrent.atomic.AtomicInteger;

public class GreeterService {
    static AtomicInteger counter = new AtomicInteger(0);

    public String greet() {

        System.out.println("Hello! Count " + counter.incrementAndGet());
        return "";
    }


}
