package cajero;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Loth
 **/
public class cajero extends JFrame implements ActionListener{
    JTextField cosa, cosa2;
    JButton punto, cancel, deposito, numero[], borrar, retiro;
    float dinero;
	public cajero(){
            numero = new JButton[10];
            dinero = 0f;
            
            setLayout(null);
            cosa = new JTextField();
            cosa.setBounds(0,0,310,40);
            add(cosa);
            cosa.setEditable(false);
            cosa.setBackground(Color.white);
            
            cosa2 = new JTextField();
            cosa2.setBounds(320,0,310,40);
            add(cosa2);
            cosa2.setEditable(false);
            cosa2.setBackground(Color.white);

            punto = new JButton(".");
            punto.setBounds(0,260,70,70);
            add(punto);
            punto.addActionListener(this);
            
            borrar = new JButton("borrar");
            borrar.setBounds(220,50,90,70);
            add(borrar);
            borrar.addActionListener(this);

            numero[9] = new JButton("9");
            numero[9].setBounds(140,190,70,70);
            add(numero[9]);
            numero[9].addActionListener(this);

            numero[8] = new JButton("8");
            numero[8].setBounds(70,190,70,70);
            add(numero[8]);
            numero[8].addActionListener(this);

            numero[7] = new JButton("7");
            numero[7].setBounds(0,190,70,70);
            add(numero[7]);
            numero[7].addActionListener(this);

            numero[6] = new JButton("6");
            numero[6].setBounds(140,120,70,70);
            add(numero[6]);
            numero[6].addActionListener(this);

            numero[5] = new JButton("5");
            numero[5].setBounds(70,120,70,70);
            add(numero[5]);
            numero[5].addActionListener(this);

            numero[4] = new JButton("4");
            numero[4].setBounds(0,120,70,70);
            add(numero[4]);
            numero[4].addActionListener(this);

            numero[3] = new JButton("3");
            numero[3].setBounds(140,50,70,70);
            add(numero[3]);
            numero[3].addActionListener(this);

            numero[2] = new JButton("2");
            numero[2].setBounds(70,50,70,70);
            add(numero[2]);
            numero[2].addActionListener(this);

            numero[1] = new JButton("1");
            numero[1].setBounds(0,50,70,70);
            add(numero[1]);
            numero[1].addActionListener(this);

            numero[0] = new JButton("0");
            numero[0].setBounds(70,260,70,70);
            add(numero[0]);
            numero[0].addActionListener(this);

            cancel = new JButton("cancel");
            cancel.setBounds(220,120,90,70);
            add(cancel);
            cancel.addActionListener(this);

            deposito = new JButton("deposito");
            deposito.setBounds(220,190,90,70);
            add(deposito);
            deposito.addActionListener(this);
            
            retiro = new JButton("retiro");
            retiro.setBounds(220,260,90,70);
            add(retiro);
            retiro.addActionListener(this);
    }
        
    public void actionPerformed(ActionEvent e) {
	if(e.getSource() == deposito){
            String oka = cosa.getText();
            float numero = Float.parseFloat(oka);
            dinero = dinero + numero;
            String resulta = String.valueOf(dinero);
            punto.setEnabled(true);
            cosa.setText("");
            if(dinero < 0){
                cosa2.setText("Error, debe: $" + resulta);
            }
            else{
                cosa2.setText(resulta);
                retiro.setEnabled(true);
            }
  	}
        if(e.getSource() == retiro){
            String oka = cosa.getText();
            float numero = Float.parseFloat(oka);
            dinero = dinero - numero;
            String resulta = String.valueOf(dinero);
            punto.setEnabled(true);
            cosa.setText("");
            if (dinero < 0){
                cosa2.setText("Error, debe: $" + resulta);
                retiro.setEnabled(false);
            }
            else{
                cosa2.setText(resulta);
            }
  	}
        if(e.getSource() == cancel){
            cosa.setText("");
            punto.setEnabled(true);
        }
        if(e.getSource() == numero[0]){
            String oka = cosa.getText();
            cosa.setText(oka + "0");
        }
        if(e.getSource() == numero[1]){
            String oka = cosa.getText();
            cosa.setText(oka + "1");
        }
        if(e.getSource() == numero[2]){
            String oka = cosa.getText();
            cosa.setText(oka + "2");
        }
        if(e.getSource() == numero[3]){
            String oka = cosa.getText();
            cosa.setText(oka + "3");
        }
        if(e.getSource() == numero[4]){
            String oka = cosa.getText();
            cosa.setText(oka + "4");
        }
        if(e.getSource() == numero[5]){
            String oka = cosa.getText();
            cosa.setText(oka + "5");
        }
        if(e.getSource() == numero[6]){
            String oka = cosa.getText();
            cosa.setText(oka + "6");
        }
        if(e.getSource() == numero[7]){
            String oka = cosa.getText();
            cosa.setText(oka + "7");
        }
        if(e.getSource() == numero[8]){
            String oka = cosa.getText();
            cosa.setText(oka + "8");
        }
        if(e.getSource() == numero[9]){
            String oka = cosa.getText();
            cosa.setText(oka + "9");
        }
        if(e.getSource() == punto){
            String oka = cosa.getText();
            cosa.setText(oka + ".");
            punto.setEnabled(false);
        }
        if(e.getSource() == borrar){
            String oka = cosa.getText();
            int largo = oka.length();
            largo = largo - 1;
            char cosita = oka.charAt(largo);
            if (cosita == '.'){
                punto.setEnabled(true);
            }
            oka = oka.substring(0,largo);
            cosa.setText(oka);
        }
    }
}
