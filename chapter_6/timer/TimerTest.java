package Core_Java_Volume_1.chapter_6.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @ClassName TimerTest
 * @Description
 * @Author yang
 * @Date 2020/7/15 22:02
 * @Version 1.0
 */
public class TimerTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(2000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
