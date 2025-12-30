import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class PaintStyleController extends JPanel{
    
    Checkbox solid;
    Checkbox dashed;
    Checkbox dotted;
    CheckboxGroup stylegroup;
    

    public PaintStyleController(PaintBrushPanel panel){
        stylegroup = new CheckboxGroup();

        solid = new Checkbox("Solid", stylegroup, true);
        dashed = new Checkbox("No solid", stylegroup, false);
        dotted = new Checkbox("Dotted", stylegroup, false);

        solid.setBounds(50, 50, 150, 30);
        dashed.setBounds(50, 50, 150, 30);
        dotted.setBounds(50, 50, 150, 30);

        solid.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(solid.getState()){
                    panel.setCurrentfillflag(true);
                    panel.setDottedflag(false);
                }
            }   
        });

        dotted.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (dotted.getState()){
                    panel.setCurrentfillflag(false);
                    panel.setDottedflag(true);
                }
            }
            
        });


        dashed.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (dashed.getState()){
                    panel.setCurrentfillflag(false) ;
                    panel.setDottedflag(false);
                }
            }
            
        });

        add(new JLabel("                                                               Styles"));
        this.add(solid);
        this.add(dashed);
        this.add(dotted);
    }
}