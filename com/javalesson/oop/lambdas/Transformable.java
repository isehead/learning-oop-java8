package com.javalesson.oop.lambdas;

@FunctionalInterface
public interface Transformable<T> {

    T transform(T t);
}
