package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    public MyFrame() { // MyFrame이 container
        setSize(300, 500);
        setTitle("MyFrame");

        this.setLayout(new FlowLayout());

        JButton button1 = new JButton("버튼");
        this.add(button1); // container에 button을 추가하는 과정 (container가 MyFrame 자신이므로 this키워드)

        JButton button2 = new JButton("버튼");
        this.add(button2);

        JButton button3 = new JButton("버튼");
        this.add(button3); // 3개를 추가하면 옆으로 흘러감 << FlowLayout

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame(); // 실행만 하면되기 때문에 자료형과 변수생성을 하지 않아도 된다.
    }
}