package amazinggame;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class MyFrame extends JFrame{
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawLine(0, 0, 500, 500);
    }
    /*public static void getCh() {
        JFrame frame = new JFrame();
        synchronized (frame) {
            frame.setUndecorated(true);
            frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
            frame.addKeyListener(new KeyListener() {
                public void keyPressed(KeyEvent e) {
                    synchronized (frame) {
                        frame.setVisible(false);
                        frame.dispose();
                        frame.notify();
                    }
                }

                public void keyReleased(KeyEvent e) {
                }
                public void keyTyped(KeyEvent e) {
                }
            });
            frame.setVisible(true);
            try {
                frame.wait();
            } catch (InterruptedException e1) {
            }
        }
    }*/
}

