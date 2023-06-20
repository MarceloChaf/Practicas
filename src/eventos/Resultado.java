package eventos;

import com.sun.source.tree.SwitchTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Resultado implements ActionListener {

    String menu;
    double resultado;

    public static ArrayList<Double> numeros= new ArrayList<>();
    JTextField jtxt;
    Double num;
    public Resultado(JTextField jtxt) {
        this.jtxt=jtxt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cadena = jtxt.getText();
        String[] camp = cadena.split(" ");
        for (String item : camp) {
            if (!item.equals("+") && !item.equals("-") && !item.equals("/") && !item.equals("*")) {
                try {
                    num = Double.parseDouble(item);
                    numeros.add(num);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: la cadena '" + item + "' no es un número válido");
                }
            }
        }

        if (numeros.size() > 2) {
            double elemento = numeros.get(0);
            menu=camp[1];
            switch (menu){
                case "+":
                    resultado+=numeros.get(0)+numeros.get(1);
                    break;
                case "-":
                    resultado+=numeros.get(0)-numeros.get(1);
                    break;
                case "*":
                    resultado+=numeros.get(0)*numeros.get(1);
                    break;
                case "/":
                    resultado+=numeros.get(0)/numeros.get(1);
                    break;
                }
            }else {
            for (int i=1;i<numeros.size();i+=2){
                menu=camp[i];
                System.out.println(numeros.get(i));
                switch (menu){
                    case "+":
                        System.out.println(numeros.get(i-1)+""+numeros.get(i+1));
                        resultado+=numeros.get(i-1)+numeros.get(i+1);
                        break;
                    case "-":
                        resultado+=numeros.get(i-1)-numeros.get(i+1);
                        break;
                    case "*":
                        resultado+=numeros.get(i-1)*numeros.get(i+1);
                        break;
                    case "/":
                        resultado+=numeros.get(i-1)/numeros.get(i+1);
                        break;
                }
            }
        }
        jtxt.setText(""+resultado);
        numeros.clear();
        resultado=0;

    }
}

