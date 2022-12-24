package Graphic_editor.work;

import Graphic_editor.Figures.Circle;
import Graphic_editor.Intarfaces.Drawable;
import Graphic_editor.Intarfaces.FigureBuilder;

import java.util.Random;
import java.util.*;

public class Reader {

    public static Drawable reader() {
        String[] shapes = {"Circle", "Quad", "Trapeze", "Triangle", "Point"};
        System.out.println("Let's drawing?");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextLine().toLowerCase()) {
                case "circle":
                    scanner.close();
                    return new CircleBuilder().build();
                case "quad":
                    scanner.close();
                    return new QuadBuilder().build();
                case "trapeze":
                    scanner.close();
                    return new TrapezeBuilder().build();
                case "triangle":
                    scanner.close();
                    return new TriangleBuilder().build();
                case "point":
                    scanner.close();
                    return new PointBuilder().build();
                default:
                    System.out.println("Could You choose something like " + shapes[new Random().nextInt(shapes.length-1)] + " or just a Point?");
            }
        }
    }
}
