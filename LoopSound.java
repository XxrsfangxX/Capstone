import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class LoopSound {
    //Class from java stack overflow
    File sadFile;
    AudioInputStream stream;
    AudioFormat format;
    DataLine.Info info; 
    Clip clip;

    public LoopSound(){
        this.sadFile= new File("Sad_Music.file");

    }

    public void playSound(){
        try{

            stream = AudioSystem.getAudioInputStream(sadFile);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        }
        catch(Exception e){
            System.out.println("File not Found");
            
        }

    }
}
