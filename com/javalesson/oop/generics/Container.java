package com.javalesson.oop.generics;

import java.io.ObjectOutputStream;

public class Container<S> {

    private S object1;

    public Container(S object1) {
        this.object1 = object1;
    }

    public S getObject1() {
        return object1;
    }

    public void setObject1(S object1) {
        this.object1 = object1;
    }
}
