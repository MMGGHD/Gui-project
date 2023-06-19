package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 인터페이스를 메인클래스에 구현하는 방식
// actionPerformed 메서드를 오버라이딩
// 리스너 객체에 this(객체 자기 자신)을 구현 (자기 클래스의 actionPerformed 메서드를 구현)
public class Event07 extends MyFrame implements ActionListener {

    private JButton btn1, btn2;

    public Event07() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트 배치
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        // 3. 리스너 생성
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        // 4. 그림그리기
        setVisible(true);
    }

    @Override //
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn.getText().equals("버튼1")) {
            System.out.println("버튼 1이 클릭되었습니다");
        } else if (btn.getText().equals("버튼2")) {
            System.out.println("버튼 2이 클릭되었습니다");
        }
    }

    public static void main(String[] args) {
        new Event07();
    }

}
