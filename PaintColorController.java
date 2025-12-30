
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class PaintColorController extends JPanel{
    private JButton redButton;
    private JButton blackButton;
    private JButton greenButton;
    private JButton cyanButton;
    private JButton grayButton;
    private JButton yellowButton;
    private JButton pinkButton;
    private JButton blueButton;
  
    
    private PaintBrushPanel paintBrushPanel;
    
    public PaintColorController(PaintBrushPanel paintBrushPanel ) {
        this.redButton=new JButton(" ");            this.redButton.setBackground(Color.RED);
        this.blackButton=new JButton(" ");          this.blackButton.setBackground(Color.BLACK);
        this.greenButton=new JButton(" ");          this.greenButton.setBackground(Color.GREEN);
        this.blueButton=new JButton(" ");           this.blueButton.setBackground(Color.BLUE);        
        this.cyanButton=new JButton(" ");           this.cyanButton.setBackground(Color.CYAN);
        this.grayButton=new JButton(" ");           this.grayButton.setBackground(Color.GRAY);
        this.yellowButton=new JButton(" ");         this.yellowButton.setBackground(Color.YELLOW);   
        this.pinkButton=new JButton(" ");           this.pinkButton.setBackground(Color.PINK);        
        
        this.paintBrushPanel=paintBrushPanel;

        
        redButton.addActionListener(new PaintColorListener(Color.RED));
        blackButton.addActionListener(new PaintColorListener(Color.BLACK));
        greenButton.addActionListener(new PaintColorListener(Color.GREEN));
        blueButton.addActionListener( new PaintColorListener(Color.BLUE));
        cyanButton.addActionListener(new PaintColorListener(Color.CYAN));
        grayButton.addActionListener(new PaintColorListener(Color.GRAY));
        yellowButton.addActionListener(new PaintColorListener(Color.YELLOW));
        pinkButton.addActionListener(new PaintColorListener(Color.PINK));
        
        add(new JLabel("        Colors"));
        add(redButton); 
        add(blackButton); 
        add(greenButton); 
        add(blueButton);
        add(cyanButton);
        add(grayButton);
        add(yellowButton);
        add(pinkButton);
    }
    
    public class PaintColorListener implements ActionListener{
        private Color color;
        public PaintColorListener(Color color) {
            this.color=color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            paintBrushPanel.setCurrentcolor(this.color) ;
            paintBrushPanel.repaint();
        }
    }

    
}