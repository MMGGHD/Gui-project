package gui.project.practice;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoveCar extends JFrame {
    int img_x = 150;
    int img_y = 150;
    JButton button;

    public MoveCar() {
        setSize(600, 300);
        button = new JButton("");
        ImageIcon icon = new ImageIcon(
                "C:\\workspace\\java_lab\\gui-project\\app\\src\\main\\java\\gui\\project\\practice\\car.png");

        button.setIcon(icon);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        button.setLocation(img_x, img_y);
        button.setSize(200, 100);
        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode) {
                    case KeyEvent.VK_UP:
                        img_y -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        img_y += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        img_x -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        img_x += 10;
                        break;
                }
                button.setLocation(img_x, img_y);
            }

            @Override
            public void keyTyped(KeyEvent arg0) {
            }

            @Override
            public void keyReleased(KeyEvent arg0) {
            }

        });

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MoveCar();
    }
}
