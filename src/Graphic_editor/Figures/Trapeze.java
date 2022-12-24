package Graphic_editor.Figures;

import Graphic_editor.Intarfaces.Color;
import Graphic_editor.Intarfaces.Shape;

import java.util.Random;

public class Trapeze implements Shape {
    private Color color;
    private int x;
    private int y;
    private double scale;

    public Trapeze(Color color, int x, int y, double scale) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Trapeze with coordinates of center: X - " + getX() + ", Y - " + getY() + ", scale: " + getScale() + " and color: " + getColor());

    }

    @Override
    public Color getColor() {
        return Color.randomColor();
    }

    @Override
    public int getX() {
        return new Random().nextInt(100);
    }

    @Override
    public int getY() {
        return new Random().nextInt(100);
    }

    @Override
    public double getScale() {
        return new Random().nextInt(100);
    }

//    public double getArea() {
//        return (sideUpper + sideBottom) / 2 * height;
//    }

}

