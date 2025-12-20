import java.awt.Color;
import java.util.ArrayList;
import java.awt.BasicStroke;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintBrushPanel extends JPanel{

    ArrayList<Shape> list;
    Shape currentShape;
    Color currentcolor;
    BasicStroke currentstroke;
    float[] dash = { 5.0f };
    boolean currentfillflag;
    JButton rectanglebutton, linebutton, ovalbutton, pencilbutton, eraserbutton;


    PaintBrushPanel(){
        list = new ArrayList<Shape>();
        currentcolor = Color.BLACK;
        currentfillflag = true;
        currentstroke = new BasicStroke(2);
    }

    // logic of handlig and buttuons
}
