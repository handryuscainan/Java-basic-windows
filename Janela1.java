package Janela;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela1 extends JFrame {
    public Janela1 () {
        setTitle("windows");
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(true);
        JButton b1 = new JButton("login");
        b1.setBounds(100, 100, 100, 50);
        b1.setFont(new Font ("Arial", Font.ITALIC, 20));
        add(b1);
        JButton b2 = new JButton("logout");
        b2.setBounds(200, 100, 100, 50);
        b2.setFont(new Font ("Arial", Font.ITALIC, 20));
        add(b2);
    }   
}
