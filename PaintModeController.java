
// import java.awt.BasicStroke;
// import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class PaintModeController extends JPanel {

    private JButton lineButton;
    private JButton rectangleButton;
    private JButton ovalButton;
    private JButton pencilButton;
    private JButton eraserButton;

    //private PaintBrushPanel paintBrushPanel;
    public PaintModeController(PaintBrushPanel paintBrushPanel) {

        // ImageIcon pencilicon = new ImageIcon("pencil.png");

        lineButton = new JButton("Line");
        rectangleButton = new JButton("Rectangle");
        ovalButton = new JButton("Oval");
        pencilButton = new JButton("Pencil");
        eraserButton = new JButton("Eraser");

        //this.paintBrushPanel=paintBrushPanel;
        lineButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Line()));
        rectangleButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Rectangle()));
        ovalButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Oval()));
        pencilButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Pencil()));
        eraserButton.addActionListener(e -> paintBrushPanel.setCurrentShape(new Eraser()));

        add(new JLabel("                                                                            Shapes"));
        add(lineButton);
        add(rectangleButton);
        add(ovalButton);
        add(pencilButton);
        add(eraserButton);
    }
 
}