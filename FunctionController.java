
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdallah
 */
public class FunctionController extends JPanel{
    private Button clearButton;
    private Button undoButton;
    
    
    private PaintBrushPanel paintBrushPanel;

    public FunctionController(PaintBrushPanel paintBrushPanel ) {
       clearButton=new Button("clear");
       undoButton=new Button("unDo");
  
         
        this.paintBrushPanel=paintBrushPanel;
 
        
        clearButton.addActionListener(new ClearListener() );
        undoButton.addActionListener(new UnDoListener() );
 
        
        add(clearButton); 
        add(undoButton); 
 
    }
    
    
    
    
    public class ClearListener implements ActionListener {

      

        @Override
        public void actionPerformed(ActionEvent e) {

            paintBrushPanel.list.clear();
            paintBrushPanel.repaint();
        }

    }
    
    public class UnDoListener implements ActionListener {

      

        @Override
        public void actionPerformed(ActionEvent e) {

             int size=paintBrushPanel.list.size();
             if(size>0)
                paintBrushPanel.list.remove(size-1);
             paintBrushPanel.repaint();
        }

    }
    
}
