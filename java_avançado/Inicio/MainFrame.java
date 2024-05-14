import javax.swing.JFrame;
import java.util.ArrayList;

public class MainFrame extends JFrame
 {      
        private ArrayList<String> tasks = new ArrayList<>();
        MainFrame()
        {   
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
