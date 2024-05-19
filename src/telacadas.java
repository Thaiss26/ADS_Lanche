import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class telacadas extends JFrame implements ActionListener {

    Produto pro;
    ArrayList<Produto> list = new ArrayList<>();

    JFrame telaCadas = new JFrame("Cadastrar Produto");
    JPanel painel = new JPanel();

    JLabel lbdesc = new JLabel("Produto");
    JLabel lbvalor = new JLabel("Valor");
    JLabel lbquantidade = new JLabel("quantidade");
    JCheckBox c1 = new JCheckBox("disponível");

    JTextField txtdesc = new JTextField();
    JTextField txtvalor = new JTextField();
    JTextField txtquantidade = new JTextField();

    JButton btsalvar = new JButton("Cadastar");
    JButton btlistar = new JButton("Listar");


    void criarTela(){

        telaCadas.setSize(300,350);
        telaCadas.setLocation(200, 200);
        painel.setLayout(null);


        lbdesc.setBounds(15,40,80,30);
        txtdesc.setBounds(100,40,150,30);
        lbvalor.setBounds(15, 90, 80, 30);
        txtvalor.setBounds(100, 90, 150, 30);
        lbquantidade.setBounds(15, 140, 80, 30);
        txtquantidade.setBounds(100, 140, 150, 30);

        btsalvar.setBounds(30, 190, 100, 30);
        btsalvar.addActionListener(this);
        btlistar.setBounds(150, 190, 100, 30);
        btlistar.addActionListener(this);


        painel.add(lbdesc);
        painel.add(txtdesc);
        painel.add(lbvalor);
        painel.add(txtvalor);
        painel.add(lbquantidade);
        painel.add(txtquantidade);
        painel.add(c1);
        painel.add(btsalvar);
        painel.add(btlistar);


        telaCadas.getContentPane().add(painel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== btsalvar) {
            String d = txtdesc.getText() ;
            Double v = Double.parseDouble(txtvalor.getText());
            Integer q = Integer.parseInt(txtquantidade.getText());
            pro = new Produto(d, v, q);
            list.add(pro);
            JOptionPane.showMessageDialog(null, "Produto Adicionado");
            txtdesc.setText("");
            txtvalor.setText("");
            txtquantidade.setText("");
            } else if (e.getSource() == btlistar) {
                StringBuilder produtos = new StringBuilder();
                for (Produto p : list){
                    produtos.append("Produto: ").append(p.getDescricao());
                    produtos.append("\n Valor: R$ ").append(p.getValor());
                    produtos.append("\n Quantidade disponível ").append(p.getQuantidade());
                }
                JOptionPane.showMessageDialog(null, produtos.toString());
            }

    }

}