package Graphic_editor;

import Graphic_editor.work.Canvas;
import Graphic_editor.work.Reader;


class DrawTest {
    public static void main(String[] args) {

        new Canvas().addFigure(Reader.reader());
    }
}
