
// import java.awt.BasicStroke;
import java.awt.Button;
// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class PaintModeController extends JPanel {

    private Button lineButton;
    private Button rectangleButton;
    private Button ovalButton;
    private Button pencilButton;
    private Button eraserButton;

    //private PaintBrushPanel paintBrushPanel;
    public PaintModeController(PaintBrushPanel paintBrushPanel) {
        lineButton = new Button("Line");
        rectangleButton = new Button("Rectangle");
        ovalButton = new Button("Oval");
        pencilButton = new Button("Pencil");
        eraserButton = new Button("Eraser");

        //this.paintBrushPanel=paintBrushPanel;
        lineButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Line()));
        rectangleButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Rectangle()));
        ovalButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Oval()));
        pencilButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Pencil()));
        eraserButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Eraser()));

        add(lineButton);
        add(rectangleButton);
        add(ovalButton);
        add(pencilButton);
        add(eraserButton);
    }
 
}
