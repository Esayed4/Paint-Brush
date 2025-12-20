import java.awt.event.MouseEvent;


public class PencilTool implements Tool{

    PaintBrushPanel panel;
    Pencil pencil;

    PencilTool(PaintBrushPanel panel){
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pencil = new Pencil(e.getX(), e.getX(), e.getY(), e.getY(), panel.currentfillflag, panel.currentstroke, panel.currentcolor);
        
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
