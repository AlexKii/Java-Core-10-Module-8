package graphic_editor;

import graphic_editor.work.Canvas;
import graphic_editor.work.Reader;


class DrawTest {
    public static void main(String[] args) {

        new Canvas().addFigure(Reader.reader());
    }
}
