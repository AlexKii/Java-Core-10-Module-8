package Graphic_editor.Figures;

import Graphic_editor.Intarfaces.Color;
import Graphic_editor.Intarfaces.Shape;


public class Triangle implements Shape {
    private Color color;
    private int x;
    private int y;
    private double scale;

    public Triangle(Color color, int x, int y, double scale) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle with coordinates of center: X - " + getX() + ", Y - " + getY() + ", scale: " + getScale() + " and color: " + getColor());

    }
    @Override
    public Color getColor() {

        return color;
    }

    @Override
    public int getX() {

        return x;
    }

    @Override
    public int getY() {

        return y;
    }

    @Override
    public double getScale() {
        return scale;
    }

//    public double getArea() {
//        double p = (side1 + side2 + side3) / 2;
//        double s = Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
//        return s;
//    }

}