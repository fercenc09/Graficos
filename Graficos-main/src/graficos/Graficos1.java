package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelMultiplicar;
    private JLabel labelResta;
    private JLabel labelDividir;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btncalcular;

    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // alto ancho
        setSize(450, 200); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btncalcular = new JButton("Calcular");
        
        labelResta = new JLabel("Resta: ");
        labelMultiplicar = new JLabel("Multiplicacion: ");
        labelDividir = new JLabel("Dividir: ");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular);      
        ventana.add(result);
        ventana.add(labelResta);
        ventana.add(labelMultiplicar);
        ventana.add(labelDividir);

        btncalcular.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btncalcularActionPerformed(evt);
            }
        });   
        
        
         
    }
    
    private void btncalcularActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}




