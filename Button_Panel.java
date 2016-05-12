import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JToggleButton;

/**
 * Write a description of class Button_Panel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_Panel extends JPanel
{
    
    private JButton sadButton;
    private JToggleButton onOrOff;
    private MainViewer canvas;
    private LoopSound sound;
    private boolean on_off;
    
    public Button_Panel(MainViewer canvas, LoopSound sound){
        this.canvas= canvas; 
        this.sound= sound;
        on_off=false;
        this.sadButton= new JButton("Sad");
         ButtonListener moodListener= new ButtonListener();
         this.sadButton.addActionListener(moodListener);
         //creates Sad Button
         this.onOrOff= new JToggleButton("On");
         ButtonListener stateListener= new ButtonListener();
         this.onOrOff.addActionListener(stateListener);
         //Creates on and off switch
         this.add(this.sadButton);
         this.add(this.onOrOff);
    }
    
    public boolean getOn_off(){
        return on_off;
    }
    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getActionCommand().equals("Sad")){
                

                
                canvas.changeMood("sad");

               if(on_off==true){
 
                   canvas.toggleOnOff();
                    sound.playSound();
              }
            

                
            }
            else if(event.getActionCommand().equals("On")){
                if(on_off== false){
                    on_off=true;
                    canvas.on();
                }
                else{
                   on_off= false;
                   canvas.clear();
                }
            }
        }
    }

}
