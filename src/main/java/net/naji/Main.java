package net.naji;


import net.naji.figure.*;

public class Main {
    public static void main(String[] args) {
    ShapeFactory circleFactory = new ShapeFactoryCircle();
    Shape circle=circleFactory.createshape();
    circle.draw();


        ShapeFactory squareFactory = new ShapeFactorySquare();
        Shape square=squareFactory.createshape();
        square.draw();
    }
}
