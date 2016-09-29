package cajero;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Loth
 **/
public class cosa {
    public static void main(String[] args) {
        cajero cajero = new cajero();
	cajero.setBounds(100, 100, 750, 750);
	cajero.setResizable(false);
	cajero.setVisible(true);
        cajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}