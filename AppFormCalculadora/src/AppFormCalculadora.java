import javax.swing.*;

public class AppFormCalculadora {
    public static void main(String[] args) throws Exception {


        JFrame form = new JFrame("Calculadora");

        form.setSize(278, 378);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setLayout(null);

        JTextField jtfVisor = new JTextField();
        jtfVisor.setBounds(10, 10, 241, 35);
        form.add(jtfVisor);
        
        JButton btnCe = new JButton("CE");
        btnCe.setBounds(10, 80, 174, 30);
        form.add(btnCe);

        JButton btnDivisao = new JButton("/");
        btnDivisao.setBounds(208, 80, 41, 30);
        form.add(btnDivisao);

        JButton btnMultipla = new JButton("x");
        btnMultipla.setBounds(208, 135, 41, 30);
        form.add(btnMultipla);

        JButton btnMenos = new JButton("-");
        btnMenos.setBounds(208, 190, 41, 30);
        form.add(btnMenos);

        JButton btnSoma = new JButton("+");
        btnSoma.setBounds(208, 245, 41, 30);
        form.add(btnSoma);

        JButton btnSete = new JButton("7");
        btnSete.setBounds(10, 135, 41, 30);
        form.add(btnSete);

        JButton btnOito = new JButton("8");
        btnOito.setBounds(76, 135, 41, 30);
        form.add(btnOito);

        JButton btnNove = new JButton("9");
        btnNove.setBounds(142, 135, 41, 30);
        form.add(btnNove);

        JButton btnQuatro = new JButton("4");
        btnQuatro.setBounds(10, 190, 41, 30);
        form.add(btnQuatro);

        JButton btnCinco = new JButton("5");
        btnCinco.setBounds(76, 190, 41, 30);
        form.add(btnCinco);
        
        JButton btnSeis = new JButton("6");
        btnSeis.setBounds(142, 190, 41, 30);
        form.add(btnSeis);

        JButton btnUm = new JButton("1");
        btnUm.setBounds(10, 245, 41, 30);
        form.add(btnUm);

        JButton btnDois = new JButton("2");
        btnDois.setBounds(76, 245, 41, 30);
        form.add(btnDois);

        JButton btnTres = new JButton("3");
        btnTres.setBounds(142, 245, 41, 30);
        form.add(btnTres);

        JButton btnZero = new JButton("0");
        btnZero.setBounds(10, 300, 107, 30);
        form.add(btnZero);

        JButton btnPonto = new JButton(".");
        btnPonto.setBounds(142, 300, 41, 30);
        form.add(btnPonto);

        JButton btnIgual = new JButton("=");
        btnIgual.setBounds(208, 300, 41, 30);
        form.add(btnIgual);

        /*
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(null, "O nome digitado é: " + jtfNome.getText());
                
            }

        });*/

        form.setVisible(true);
        
    }
}
