import java.awt.BasicStroke;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StrokeSlider extends JPanel{

    private JSlider slider;

    public StrokeSlider(PaintBrushPanel panel){
        slider = new JSlider(0, 50, 10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);

        slider.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                panel.setCurrentstroke(new BasicStroke(slider.getValue()));
            }
        });


        add(new JLabel("                                                            Stroke level"));
        add(slider);
        
    }
}
