
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
// import java.util.ArrayList;
import javax.swing.JPanel;


public class FunctionController extends JPanel{
    private Button clearButton;
    private Button undoButton;
    
    
    private PaintBrushPanel paintBrushPanel;

    public FunctionController(PaintBrushPanel paintBrushPanel) {
       clearButton=new Button("Clear");
       undoButton=new Button("Undo");
  
       this.paintBrushPanel=paintBrushPanel; 
        
       clearButton.addActionListener(new ClearListener());
       undoButton.addActionListener(new UnDoListener()); 
       add(clearButton); 
       add(undoButton); 
       
       
        
    }
    
    
    public class ClearListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
             paintBrushPanel.setList( new ArrayList<Shape>());
             paintBrushPanel.repaint();
        }
    }
    
    public class UnDoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Shape> myList=paintBrushPanel.getList();
            int size=myList.size();
            if(size>0)
                myList.remove(size-1);
               
            paintBrushPanel.repaint();
        }
    }
}
