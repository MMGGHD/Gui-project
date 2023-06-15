package gui.project.ex01;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        f.setSize(600, 500); // 객체의 상태값을 부여
        f.setVisible(true); // 운영체제에 맞게 모니터에 그림을 그리는 메서드
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Container 닫을시 Demon종료메서드
    }
}
