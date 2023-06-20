package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressNumber implements ActionListener {
    String num;
    JTextField jtxt;
    public PressNumber(String num, JTextField jtxt) {
        this.num = num;
        this.jtxt = jtxt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aux =jtxt.getText();
        jtxt.setText(aux+num);
    }
}
