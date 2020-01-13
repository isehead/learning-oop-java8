package com.javalesson.oop.lambdas.model;

public interface AnotherShape {

    default double calcSomething(){
        return 2;
    }
}
