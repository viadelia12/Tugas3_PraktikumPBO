package Swing;
import javax.swing.*;

public class Tampilan extends JFrame {
    JLabel lusername = new JLabel("Username : ");
    JTextField fusername = new JTextField();
    
    JLabel lpass = new JLabel("Password : ");
    JPasswordField fpass = new JPasswordField();
    
    JButton blogin = new JButton("Login");
    JButton bcancel = new JButton("Cancel");
    
    public Tampilan(){
        setTitle("Login");
        setSize(250, 150);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        
        setLayout(null);
        add(lusername);
        add(fusername);
        add(lpass);
        add(fpass);
        add(blogin);
        add(bcancel);
        
        lusername.setBounds(10,10,120,20);
        fusername.setBounds(80, 10, 150, 20);
        lpass.setBounds(10, 40, 120, 20);
        fpass.setBounds(80, 40, 150, 20);
        blogin.setBounds(20, 70, 80, 20);
        bcancel.setBounds(120, 70, 80, 20);
    }
}
