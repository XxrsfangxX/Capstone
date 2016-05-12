import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Write a description of class MainViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainViewer extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private String mood;
    private boolean onOff;
    private int count;
    /**
     * Default constructor for objects of class MainViewer
     */
    public MainViewer()
    {
        this.mood="";
        this.onOff= false;
        this.count= 0;
    }

    public void clear(){
        this.setVisible(false);

    }

    public void changeMood(String mood1){
        this.mood= mood1;
    }

    public void on(){
        this.setVisible(true);
    }

    public void toggleOnOff(){
        if(onOff== false){
            onOff= true;
        }
        else{
            onOff= false;
        }
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D) g;
        if(mood.equals("sad")&&(onOff==true)){

            Sad_visual sad= new Sad_visual();
            if(count<100){
                if(count%2==0){
                    g2.setColor(sad.getPrimaryColor());
                    for(int i= 0; i<(Math.random()*100); i++){
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawRipples(g2,count);
                        if(i%5==0){
                            g2.setColor(sad.getQuinaryColor());
                        }
                        else if(i%4==0){
                            g2.setColor(sad.getQuaternaryColor());

                        }
                        else if(i%3==0){
                            g2.setColor(sad.getTertiaryColor());

                        }
                        else if(i%2==0){
                            g2.setColor(sad.getPrimaryColor());

                        }
                        else{
                            g2.setColor(sad.getSecondaryColor()); 
                        }

                     
                        sad.drawWaves(g2,count);
                    }
                    g2.setColor(sad.getSecondaryColor()); 

                
                }
                else{
                    g2.setColor(sad.getSecondaryColor());
                    for(int i= 0; i<(Math.random()*100); i++){
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawRipples(g2,count);
                        if(i%5==0){
                            g2.setColor(sad.getQuinaryColor());
                        }
                        else if(i%4==0){
                            g2.setColor(sad.getQuaternaryColor());

                        }
                        else if(i%3==0){
                            g2.setColor(sad.getTertiaryColor());

                        }
                        else if(i%2==0){
                            g2.setColor(sad.getSecondaryColor());

                        }
                        else{
                            g2.setColor(sad.getPrimaryColor()); 
                        }
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);
                        sad.drawCircles(g2);

                        sad.drawWaves(g2,count);
                    }
                    g2.setColor(sad.getPrimaryColor()); 

              
                }

                if(count==50){
                    for(int i=0; i<1000; i++){
                        sad.drawDrops(g2, i);
                    }
                }
                count++;
            }
            else{

                count=0;

            }
        }
        else{

        }
    }

    public void nextFrame(){
        repaint();

    }
}

