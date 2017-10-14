package com.mrTequila.Structural.Bridge;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color ");
        color.applyColor();
    }
}
