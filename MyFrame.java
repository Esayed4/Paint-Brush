import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame extends JFrame {

    PaintBrushPanel panel; 
    FunctionController myFunctionController;
    PaintColorController myPaintColorController;
    PaintModeController myPaintModeController;
    PaintStyleController myPaintStyleController;
    StrokeSlider strokeSlider;

    public MyFrame() {
        
        panel = new PaintBrushPanel();
        panel.setBackground(Color.WHITE);

        
        myFunctionController = new FunctionController(panel);
        myPaintColorController = new PaintColorController(panel);
        myPaintModeController = new PaintModeController(panel);
        myPaintStyleController = new PaintStyleController(panel);
        strokeSlider = new StrokeSlider(panel);



        JPanel toolbar = new JPanel();
        toolbar.setLayout(new GridLayout(2, 1));

        JPanel actionstoolbar = new JPanel();
        actionstoolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        actionstoolbar.add(myFunctionController);
        actionstoolbar.add(myPaintModeController);

        JPanel custoolbar = new JPanel();
        custoolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
        custoolbar.add(myPaintColorController);
        //custoolbar.add(myPaintModeController);
        custoolbar.add(myPaintStyleController);
        custoolbar.add(strokeSlider);

        actionstoolbar.setPreferredSize(new Dimension(800, 10));
        custoolbar.setPreferredSize(new Dimension(800, 60));
        
        toolbar.add(actionstoolbar); 
        toolbar.add(custoolbar); 
        this.add(toolbar, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER); 
 
        this.setTitle("Paint Brush - Drawing Everywhere");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(2000, 2000); 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}