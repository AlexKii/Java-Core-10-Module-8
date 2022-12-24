package Graphic_editor.Figures;

import Graphic_editor.Intarfaces.Color;
import Graphic_editor.Intarfaces.Shape;

import java.util.Random;

public class Quad implements Shape {
    private Color color;
    private int x;
    private int y;
    private double scale;

    public Quad(Color color, int x, int y, double scale) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Quad with coordinates of center: X - " + getX() + ", Y - " + getY() + ", scale: " + getScale() + " and color: " + getColor());
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
//        return Math.pow(side, 2);
//    }

}