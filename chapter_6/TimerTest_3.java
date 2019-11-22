package Core_Java_Volume_1.chapter_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class TimerTest_3 {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(5000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}

class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
