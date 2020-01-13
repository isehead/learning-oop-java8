package com.javalesson.oop.lambdas.model;

import java.util.List;

public interface Shape {

    double calcSquare();

    static double calcShapeSquare(List<Shape> shapes) {
        double squareNum = 0;
        for (Shape shape : shapes) {
            squareNum = squareNum + shape.calcSquare();
        }
        return squareNum;
    }

    default double calcSomething(){
        return 1;
    }
}
