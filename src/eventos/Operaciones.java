package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Operaciones implements ActionListener {
    int operador;
    ArrayList<String> lista=new ArrayList<>();
    JTextField jtxt;
    JTextField txtResultado;

    public Operaciones(int operador, JTextField jtxt  ) {
        this.operador = operador;
        this.jtxt= jtxt;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String aux=jtxt.getText();
        String ope="";
        switch (operador){
            case 0:
                ope="+";
                break;
            case 1:
                    ope="-";
                break;
            case 2:
                ope="/";
                break;
            case 3:
                ope="*";
                break;
        }
        jtxt.setText(aux+" "+ope+" ");
    }
}
