import java.awt.FlowLayout;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Main 
{
    public static void main (String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbList = new JLabel();
        lbList.setText("Lista de atividades:");
        JButton btAdd = new JButton();
        Register register = new Register(frame); 
        btAdd.addActionListener(e->{
            frame.setVisible(false);     
            register.setVisible(true);

        });

        
        JPanel txtPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        txtPanel.add(lbList);     
        
        JPanel listPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        JLabel lb = new JLabel();
        if(register.getTasks().size() != 0)
        {
            lb.setText(register.getTasks().get(0));
        }
            
        listPanel.add(lb);
        
        

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
        btnPanel.add(btAdd);

        JPanel mainPanel = new JPanel();
        mainPanel.add(txtPanel);
        mainPanel.add(btnPanel);


        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        

        frame.add(mainPanel);
        frame.setVisible(true);
        frame.pack();

    }    
}
