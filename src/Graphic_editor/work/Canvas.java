package Graphic_editor.work;

import Graphic_editor.Figures.*;
import Graphic_editor.Intarfaces.Color;
import Graphic_editor.Intarfaces.Drawable;
import Graphic_editor.Intarfaces.FigureBuilder;

import java.util.Random;

public class Canvas {
    public void addFigure(Drawable draw) {
        draw.draw();
    }
}
class CircleBuilder implements FigureBuilder {

    @Override
    public Drawable build() {
        return new Circle(Color.randomColor(), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
    }
}
class PointBuilder extends Canvas implements FigureBuilder {
    @Override
    public Drawable build() {
        return new Point(Color.randomColor(), new Random().nextInt(100), new Random().nextInt(100));
    }
}
class QuadBuilder extends Canvas implements FigureBuilder {
    @Override
    public Drawable build() {
        return new Quad(Color.randomColor(), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
    }
}
class TrapezeBuilder extends Canvas implements FigureBuilder {
    @Override
    public Drawable build() {
        return new Trapeze(Color.randomColor(), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
    }
}
class TriangleBuilder extends Canvas implements FigureBuilder {
    @Override
    public Drawable build() {
        return new Triangle(Color.randomColor(), new Random().nextInt(100), new Random().nextInt(100), new Random().nextInt(100));
    }
}