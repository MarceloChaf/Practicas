package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cleaner implements ActionListener {
    JTextField jtxt;

    public Cleaner(JTextField jtxt) {
        this.jtxt = jtxt;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jtxt.setText("");
        Resultado.numeros.clear();
    }
}
