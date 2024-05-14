import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbLogin = new JLabel();
        lbLogin.setText("Login:");

        JTextField tfLogin = new JTextField("", 20);

        JLabel lbPass = new JLabel();
        lbPass.setText("Senha:");

        JPasswordField pfPass = new JPasswordField("", 20);
        pfPass.setEchoChar('*');

        JPanel pnLogin = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        pnLogin.add(lbLogin);
        pnLogin.add(tfLogin);

        JPanel pnPass = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        pnPass.add(lbPass);
        pnPass.add(pfPass);

        JButton btLogin = new JButton("Entrar");
        btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tfLogin.getText().equals("don")) {
                    JOptionPane.showMessageDialog(null, "Nao! Voce nao eh reizinho delas!");
                    return;
                }

                String correctPass = "verstapi";
                char[] password = pfPass.getPassword();
                String userPass = new String(password);
                
                if (!userPass.equals(correctPass)) {
                    JOptionPane.showMessageDialog(null, "Nao! Voce nao eh reizinho delas!");
                    return;
                }

                if (correctPass.length() != password.length) {
                    JOptionPane.showMessageDialog(null, "Nao! Voce nao eh reizinho delas!");
                    return;
                }

                JOptionPane.showMessageDialog(null, "Parabens! Voce eh o reizinho delas!");
                frame.setVisible(false);

                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(pnLogin);
        mainPanel.add(pnPass);
        mainPanel.add(btLogin);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}