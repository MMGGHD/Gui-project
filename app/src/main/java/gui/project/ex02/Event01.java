package gui.project.ex02;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.*;

public class Event01 extends JFrame {

    private JButton button;
    private JButton button2;
    private JLabel label;
    int counter = 0;

    public Event01() {
        setSize(600, 200);
        setLayout(new FlowLayout());

        button = new JButton("증가");
        button2 = new JButton("2 증가");
        label = new JLabel("현재의 카운터 값: " + counter);
        // 버튼에다 이벤트리스너(실행할 내용(행위))를 장착
        // 즉, 메서드를 넣어야 하지만 자바에서는 메서드가 독립적으로 존재할수 없기 때문에 '클래스'를 넣는다.
        button.addActionListener(new Inner());
        button2.addActionListener(new Inner());

        add(button);
        add(button2);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /*
     * 이벤트 등록 << OS에게 어떤 콜백메서드가 실행되게 할지 등록
     * 0. 리스너도 객체이므로 ActionListener(리스너 객체)를 생성한다.
     * 0. 컴포넌트에 addActionListener를 붙인다. (컴포넌트에서 발생하는 이벤트를 감시하라는 명령)
     * 1. 사용자가 클릭을 누른다
     * 2. OS의 리스너가 이것을 감지
     * 3. ActionListener 인터페이스의 ActionPerformed()라는 메서드를 때림
     * 4. 자바가 ActionListener를 호출하여 로직 실행 (콜백 메서드)
     * 5. 콜백 메서드 << 자바는 OS에 해주는게 없다. 사용자가 입력한 이벤트를 받았을 뿐
     */

    class Inner implements ActionListener { // 클래스안의 클래스(내부클래스) << 다른데서는 사용하지 않는, 여기서만 사용할 클래스

        /*
         * actionPerformed(ActionEvent e) 로직(콜백 메서드)의 실행
         * 1. 사용자가 클릭(ActionEvent)을 한다.
         * 2. 따라서 매개변수 e에는 클릭의 정보(위치, 시간 등등..)가 담기게 된다.
         * 3. e.getSource() 메서드는 받은 e의 정보를 불러오는 메서드.
         * 4. OS개발자는 이 정보를 어디에서 받는지(버튼, 체크박스 등등..) 알수 없으므로 Object타입으로 설정해 놓았다.
         * 5. 정보를 알고있는 2차개발자가 강제형변환을 통해서 타입을 정의하고 actionPerformed의 지역변수에 담는다.
         * 6. 이 메서드는 heap변수 'button'의 메서드안에서 호출된 객체의 메서드이므로 지역변수의 값이 button에 담기게 된다.
         * 7. 따라서 btn.getText()는 button의 Text를 get해준다.
         */

        @Override
        public void actionPerformed(ActionEvent e) {

            JButton btn = (JButton) e.getSource();

            if (btn.getText().equals("증가")) {
                System.out.println("1번 버튼 클릭 됨: ");
                System.out.println(btn.getText());

                counter++;
                System.out.println(counter);

                // 실제 값은 바뀌지만 레이블이 다시그려지지 않기 때문에 밑의 Set코드를 추가.
                label.setText("현재의 카운터값" + counter);

            } else {
                System.out.println("2번 버튼 클릭 됨: ");
                System.out.println(btn.getText());

                counter = counter + 2;
                System.out.println(counter);

                // 실제 값은 바뀌지만 레이블이 다시그려지지 않기 때문에 밑의 Set코드를 추가.
                label.setText("현재의 카운터값" + counter);
            }

        }
    }

    public static void main(String[] args) {
        new Event01();
    }

}
