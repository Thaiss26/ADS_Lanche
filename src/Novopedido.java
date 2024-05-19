import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Novopedido extends JFrame implements ActionListener {

    Produto pro;
    ArrayList<Produto> list = new ArrayList<>();

    JPanel painel = new JPanel();

    JLabel lbcliente = new JLabel("Cliente");

    JLabel lbselecpedido = new JLabel("Selecione seu pedido");
    JComboBox<String> cbopcao = new JComboBox<>();

    JTextField txtCliente = new JTextField();

    JLabel lbselped = new JLabel("Pedido:");
    JLabel lbpedido = new JLabel();

    JButton btcontinue = new JButton("Continuar");


    Novopedido(){
        setTitle("Novo Pedido");
        setSize(600,700);
        setLocation(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel.setLayout(null);

        lbcliente.setBounds(25,50,80,30);
        txtCliente.setBounds(100, 40, 150, 30);
        lbselecpedido.setBounds(25,90,80,30);
        cbopcao.setBounds(25,140,80,30);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        lbpedido.setText(cbopcao.getSelectedItem().toString());
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


    
    
}
