import java.awt.event.MouseEvent;


public class OvalTool implements Tool{

    PaintBrushPanel panel;
    Oval oval;

    OvalTool(PaintBrushPanel panel){
        this.panel = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        oval = new Oval(e.getX(), e.getX(), e.getY(), e.getY(), panel.currentfillflag, panel.currentstroke, panel.currentcolor);
        
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
