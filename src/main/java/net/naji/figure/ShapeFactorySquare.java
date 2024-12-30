package net.naji.figure;

public class ShapeFactorySquare extends ShapeFactory{
    @Override
    public Shape createshape() {
        return new Square();
    }
}
