package Graphic_editor.Figures;

import Graphic_editor.Intarfaces.Color;
import Graphic_editor.Intarfaces.Drawable;

import java.util.Random;

public class Point implements Drawable {
    private Color color;
    private int x;
    private int y;

    public Point(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Point with coordinates: X - " + getX() + ", Y - " + getY() + ", and color: " + getColor());
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
}
