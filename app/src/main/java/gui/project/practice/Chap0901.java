package gui.project.practice;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chap0901 extends JFrame {

    public Chap0901() {
        setSize(300, 150);
        setLocation(1200, 800);
        setTitle("CHAP0901");
        getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button1 = new JButton("확인");
        button1.setBackground(Color.yellow);
        JButton button2 = new JButton("취소");
        button2.setBackground(Color.green);
        JButton button3 = new JButton("추가");
        button3.setBackground(Color.blue);
        JPanel panel1 = new JPanel();
        panel1.setSize(150, 75);
        panel1.setBackground(Color.orange);
        panel1.add(button1);
        panel1.add(button2);
        add(panel1);
        add(button3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Chap0901();
    }
}
