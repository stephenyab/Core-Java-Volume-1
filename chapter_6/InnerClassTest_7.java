package Core_Java_Volume_1.chapter_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InnerClassTest_7 {
    public static void main(String[] args) {
        TalkingClock clock=new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener=new TimePrinter();
        Timer t=new Timer(interval,listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is "+new Date());
            if (beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}
