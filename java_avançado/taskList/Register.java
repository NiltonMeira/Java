import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register extends JFrame {

    private ArrayList<String> tasks = new ArrayList<>();

    public Register(JFrame frame) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbTeste = new JLabel();
        lbTeste.setText("Nome da atividade:");

        JTextField tfAtividade = new JTextField("", 20);

        JButton btSubmit = new JButton();
        btSubmit.addActionListener(e -> {
            this.setVisible(false);

            frame.setVisible(true);
            String textFieldValue = tfAtividade.getText();
            tasks.add(textFieldValue);
            System.out.println(this.tasks);
            JPanel taskslist = new JPanel();
            JLabel lb = new JLabel();
            lb.setText(textFieldValue);
            taskslist.add(lb);

            frame.add(taskslist);   
            frame.repaint();
            frame.pack();
        });

        JPanel mainPanel = new JPanel();
        mainPanel.add(lbTeste);
        mainPanel.add(tfAtividade);
        mainPanel.add(btSubmit);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        this.add(mainPanel);
        this.pack();
    }

    public ArrayList<String> getTasks()
    {   
        System.out.println(tasks);
        return tasks;
    }

}
