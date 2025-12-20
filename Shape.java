import java.awt.BasicStroke;
import java.awt.Color;
// import java.awt.Font;

public abstract class Shape {

    final int x1,y1;
    int x2,y2;
    final Color color;
    // final Font font;
    final Boolean fillflag;
    final BasicStroke stroke;

    public Shape(int x1, int x2, int y1, int y2, Boolean fillflag, BasicStroke stroke, Color color){
        this.x1 = x1;
        this.x2= x2;
        this.y1 = y1;
        this.y2 = y2;
        this.fillflag = fillflag;
        this.stroke = stroke;
        this.color = color;
    }
    


    public abstract void draw();
}
