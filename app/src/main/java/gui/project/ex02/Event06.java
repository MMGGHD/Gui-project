package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//이벤트 소스
public class Event06 extends MyFrame {

    private JButton btn1, btn2;

    public Event06() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트 배치
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        // 3. 리스너 생성
        Callback call = new Callback(); // 콜백될 타겟 메서드
        btn1.addActionListener(call);
        btn2.addActionListener(call);

        // 4. 그림그리기
        setVisible(true);
    }

    class Callback implements ActionListener { // 내부클래스를 작성하여 콜백 타겟 지정

        @Override
        public void actionPerformed(ActionEvent e) {
            Object target = e.getSource();
            JButton btn = (JButton) target; // JButton의 set/get등 메서드를 호출하기 위해 다운캐스팅

            System.out.println(btn.getText());
            System.out.println(btn.getX());
            System.out.println(btn.getY());
            System.out.println(btn.getHeight());
            System.out.println(btn.getWidth());

            if (btn.getText().equals("버튼1")) {
                System.out.println("버튼 1이 클릭되었습니다");
            } else if (btn.getText().equals("버튼2")) {
                System.out.println("버튼 2이 클릭되었습니다");
            }
        }

    }

    public static void main(String[] args) {
        new Event06();
    }
}
