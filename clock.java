import java.util.TimerTask;

public class clock extends TimerTask
{
    /** description of instance variable x (add comment for each instance variable) */
    private MainViewer main;

    /**
     * Default constructor for objects of class Timer
     */
    public clock(MainViewer main)
    {
        this.main= main;
        
    }

    public void run(){
        main.nextFrame();
    }


}
