
package com.csbl.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class SoftwareLabel extends JLabel {

    private static final long serialVersionUID = 1L;
    private static final int BLINKING_RATE = 800;
    private boolean blinkingOn = true;

    public SoftwareLabel(String text) {
        super(text);
        this.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
        this.setBackground(Color.WHITE);
        this.setForeground(Color.darkGray);
        Timer timer = new Timer(BLINKING_RATE , new TimerListener(this));
        timer.setInitialDelay(0);
        timer.start();
    }

    public boolean isBlinkingOn() {
        return blinkingOn;
    }

    public void setBlinkingOn(boolean blinkingOn) {
        this.blinkingOn = blinkingOn;
    }

    private static Color[] colors = new Color[] {
        Color.red, Color.green, Color.blue, Color.orange, Color.pink, Color.magenta, Color.yellow
    };

    private class TimerListener implements ActionListener {
        private SoftwareLabel bl;
        private Color bg;
        private Color fg;
        private boolean isForeground = true;
        Random random = new Random();
        int n [] = {0,1,2,3,4,5,6};

        public TimerListener(SoftwareLabel bl) {
            this.bl = bl;
            fg = bl.getForeground();
            bg = bl.getBackground();
        }



        @Override
        public void actionPerformed(ActionEvent e) {
            if (bl.blinkingOn)
            {
                bl.setForeground(colors[getIndex()]);
                /*if (isForeground)
                {
                    bl.setForeground(fg);
                }
                else
                {
                    bl.setForeground(bg);                    
                }*/
                isForeground = !isForeground;
                
            }
            else
            {
                if (isForeground)
                {
                    bl.setForeground(fg);
                    isForeground = false;
                }
            }
        }

        private int getIndex()
        {
            return n[random.nextInt(n.length)];
        }




    }

    

}
