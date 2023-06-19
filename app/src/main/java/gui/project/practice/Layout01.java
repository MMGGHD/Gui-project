package gui.project.practice;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFlow extends JFrame {

    public MyFlow() {

        setTitle("Flowlayout");
        setSize(500, 300);
        setLocation(700, 500);
        // 레이아웃관리자도 클래스이므로 실체화시켜서 setLayout으로 임명해주어야 한다
        setLayout(null); // 레이아웃관리자도 클래스이므로 실체화시켜서 setLayout으로 임명해주어야 한다
        ImageIcon icon = new ImageIcon(MyFlow.class.getResource("logoicon.png"));
        JButton b1 = new JButton(icon);
        JButton b2 = new JButton(icon);
        JButton b3 = new JButton(icon);
        b1.setSize(30, 50);
        b1.setLocation(15, 15);
        b2.setSize(30, 50);
        b2.setLocation(25, 25);
        b3.setSize(30, 50);
        b3.setLocation(35, 35);
        this.add(b2);
        this.add(b1);
        this.add(b3);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}

public class Layout01 {

    public static void main(String[] args) {
        new MyFlow();
    }
}
