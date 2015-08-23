package main;

import com.csbl.ui.MainFrame;


public class Main {

    
    public static void main(String args[])
    {
        try
           {
               javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
           }
           catch(javax.swing.UnsupportedLookAndFeelException | java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException e){
           }
        
        new MainFrame().setVisible(true);
            
    }
}
