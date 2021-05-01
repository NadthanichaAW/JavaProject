package javafxgame;

import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author beaut
 */
public class Timer1 {

    private int second;
    private int minute;
    private Timer timer;

    public Timer1() {
        second = 0;
        minute = 0;
        
        normalTimer();
        timer.start();
    }
    public int gs(){
        return second;
    }
    
    public void normalTimer() {
        timer = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                second++;
                
                if (second == 60) {
                    second = 0;
                    minute++;
                   
                }
                System.out.println(second);
            }
        });
    }
    

}
