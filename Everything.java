import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.util.Timer;

import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

/**
 * Write a description of class Everything here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Everything 
{
    private MainViewer main;
    private Button_Panel butt;
     private static final int FRAME_WIDTH= 1000;
     private static final int FRAME_HEIGHT=1000;
 
    public Everything(MainViewer main ,Button_Panel butt ){
        this.main= new MainViewer();
        this.butt= butt;

        JFrame frame= new JFrame();
        
        frame.add(main, BorderLayout.CENTER);
        frame.add(butt, BorderLayout.SOUTH);
        
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    public Everything(){
        
    }
    
    public static void main(String[] args) throws Exception{
        try{
        MainViewer main= new MainViewer();
        
        LoopSound sound= new LoopSound();
        Button_Panel butt= new Button_Panel(main, sound);
        //Creates main viewer and button panel
        Timer t= new Timer();

        //Creates timer and sets the time

        t.scheduleAtFixedRate(new clock(main), 0,15);
       
        Everything every= new Everything(main, butt);
        //crafts the program
        
 
    }
    catch(Exception InterruptedException){
    
    }
    }

}

