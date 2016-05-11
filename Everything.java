
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.util.Timer;
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
    
    public static void main(String[] args){
        try{
        MainViewer main= new MainViewer();
        Button_Panel butt= new Button_Panel(main);
        
        Timer t= new Timer();
        t.scheduleAtFixedRate(new clock(main), 100,100);
        Everything every= new Everything(main, butt);


    }
    catch(Exception InterruptedException){
    
    }
    }

}
