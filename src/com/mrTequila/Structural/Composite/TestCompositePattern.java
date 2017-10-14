package com.mrTequila.Structural.Composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();
        drawing.add(tri);
        drawing.add(circle);
        drawing.draw("Green");

    }
}
