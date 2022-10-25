package ch07;

import java.awt.*;
import java.awt.event.*;

class Exercise7_9 {
    
    public static void main(String[] args) {
        
        Frame f = new Frame();
        f.addWindowListener(new EventHandler2());
    }
}

class EventHandler2 extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
