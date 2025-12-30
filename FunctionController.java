import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
// import java.util.ArrayList;
import javax.swing.JPanel;


public class FunctionController extends JPanel{
    private JButton clearButton;
    private JButton undoButton;
    
    
    private PaintBrushPanel paintBrushPanel;

    public FunctionController(PaintBrushPanel paintBrushPanel) {
       clearButton=new JButton("Clear");
       undoButton=new JButton("Undo");
  
       this.paintBrushPanel=paintBrushPanel; 
        
       clearButton.addActionListener(new ClearListener());
       undoButton.addActionListener(new UnDoListener()); 
       

        JButton saveBtn = new JButton("Save");
        saveBtn.addActionListener(e -> {
            ImageSaver.savePanelAsPng(paintBrushPanel); 
        });
        
        
        JButton uploadBtn = new JButton("Upload");
        uploadBtn.addActionListener(e -> {
            ImageLoader.uploadToPanel(paintBrushPanel);
        });
       
        add(new JLabel("         Actions"));
        add(clearButton); 
        add(undoButton); 
        add(saveBtn); 
        add(uploadBtn); 
       
       
        
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