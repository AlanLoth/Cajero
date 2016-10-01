package cajero;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Loth
 **/
public class cosa {
    public static void main(String[] args) {
        formulario cajero = new formulario();
	cajero.setBounds(100, 100, 400, 500);
	cajero.setResizable(false);
	cajero.setVisible(true);
        cajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
