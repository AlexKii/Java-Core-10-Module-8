package Graphic_editor.Intarfaces;

import java.util.Random;


public enum Color {

    BLACK("black"), RED("red"), GREEN("green"), BLUE("blue");

    private String colorName;

    Color(String colorName) {

        this.colorName = colorName;
    }

    @Override
    public String toString() {

        return colorName;
    }

    public static Color randomColor() {

        return values()[new Random().nextInt(4)];
    }

}
