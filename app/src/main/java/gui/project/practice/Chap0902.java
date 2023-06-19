package gui.project.practice;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Chap0902 extends JFrame {
    public Chap0902() { // JFrame의 생성자
        setSize(600, 400);
        setLayout(null);
        setTitle("Label Test");

        ImageIcon icon = new ImageIcon(MyFlow.class.getResource("logoicon.png"));
        JButton b1 = new JButton(icon);
        b1.setSize(70, 70);
        JButton b2 = new JButton("login");
        JButton b3 = new JButton("cancel");
        b2.setSize(60, 40);
        b3.setSize(60, 40);

        JLabel l1 = new JLabel("확인을 누르세요");
        l1.setIcon(icon);
        JLabel l2 = new JLabel("눌렀냐?");
        add(l1);
        l1.setSize(100, 20);

        JLabel l3 = new JLabel(" id ");
        JLabel l4 = new JLabel("pw");

        JPanel panel1 = new JPanel();
        panel1.setSize(235, 135);
        panel1.setLocation(250, 150);
        panel1.setBackground(Color.GRAY);
        add(panel1);
        panel1.add(l2);
        panel1.add(b1);

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JPasswordField(10);

        JPanel panel3 = new JPanel();
        panel3.add(l3);
        panel3.add(t1);
        JPanel panel4 = new JPanel();
        panel4.add(l4);
        panel4.add(t2);

        JPanel panel2 = new JPanel();
        panel2.setSize(200, 135);
        panel2.setLocation(0, 150);
        panel2.setBackground(Color.white);
        add(panel2);
        panel2.add(panel3);
        panel2.add(panel4);
        panel2.add(b2);
        panel2.add(b3);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Chap0902();
    }
}
