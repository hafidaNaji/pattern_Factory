package net.naji.figure;

public class ShapeFactoryCircle extends ShapeFactory{
    @Override
    public Shape createshape() {
        return new Circle();
    }
}
