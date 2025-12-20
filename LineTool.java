import java.awt.event.MouseEvent;


public class LineTool implements Tool{

    PaintBrushPanel panel;
    Line line;

    LineTool(PaintBrushPanel panel){
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        line = new Line(e.getX(), e.getX(), e.getY(), e.getY(), panel.currentfillflag, panel.currentstroke, panel.currentcolor);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // logic
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // logic
        
    }

}
