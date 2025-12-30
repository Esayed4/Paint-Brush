import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Actions extends JPanel{

    JButton actions;

    public Actions(PaintBrushPanel panel){

        actions = new JButton("file");

        actions.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
            
        });
    }
}
