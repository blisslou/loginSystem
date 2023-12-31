import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class loginpage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("login");
    JButton resetbutton = new JButton("reset");
    JTextField userid = new JTextField("Username");
    JPasswordField passwordfield = new JPasswordField("Password");
    JLabel useridlabel = new JLabel("User ID");
    JLabel passwordlabel = new JLabel("Password");
    JLabel messagelabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<>();

    loginpage(HashMap<String, String> logininfoOriginal) {
        logininfo = logininfoOriginal;
        useridlabel.setBounds(50, 100, 75, 25);
        passwordlabel.setBounds(50, 150, 75, 25);
        messagelabel.setBounds(125, 350, 250, 35);
        userid.setBounds(125, 100, 200, 25);
        passwordfield.setBounds(125, 150, 200, 25);
        loginbutton.setBounds(160, 200, 100, 35);
        resetbutton.setBounds(160, 250, 100, 35);
        messagelabel.setFont(new Font(null, Font.ITALIC, 25));
        loginbutton.setFocusable(false);
        resetbutton.setFocusable(false);
        loginbutton.addActionListener(this);
        resetbutton.addActionListener(this);
        frame.add(loginbutton);
        frame.add(resetbutton);
        frame.add(messagelabel);
        frame.add(useridlabel);
        frame.add(passwordlabel);
        frame.add(userid);
        frame.add(passwordfield);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetbutton) {
            userid.setText("");
            passwordfield.setText("");
            messagelabel.setText("");
        }
        if (e.getSource() == loginbutton) {
            String userID = userid.getText();
            String password = String.valueOf(passwordfield.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    messagelabel.setForeground(Color.GREEN);
                    messagelabel.setText("Login Successful");
                    frame.dispose();
                    welcomepage welcome = new welcomepage(userID);
                } else {
                    messagelabel.setForeground(Color.RED);
                    messagelabel.setText("Wrong Password");
                }
            }
            else{
                messagelabel.setForeground(Color.RED);
                messagelabel.setText("userID not present");
            }
        }
    }
}
