import java.awt.event.MouseEvent;


public class EraserTool implements Tool{

    PaintBrushPanel panel;
    Eraser eraser;

    EraserTool(PaintBrushPanel panel){
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        eraser = new Eraser(e.getX(), e.getX(), e.getY(), e.getY(), panel.currentfillflag, panel.currentstroke, panel.currentcolor);
        
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
