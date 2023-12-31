import javax.swing.*;
import java.awt.*;

public class welcomepage {
    JFrame frame= new JFrame();
    JLabel welcomelabel= new JLabel("HELLO!!!");

    welcomepage(String userID){
        welcomelabel.setBounds(0,0,300,50);
        welcomelabel.setFont(new Font("New Ink",Font.BOLD,25));
        welcomelabel.setText("HELLO "+userID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(welcomelabel);
    }
}
