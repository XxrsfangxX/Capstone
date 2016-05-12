import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
/**
 * Write a description of abstract class Visual here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Visual 
{
    /** description of instance variable x (add comment for each instance variable) */
    private Color backgroundColor;
    private int primarySpeed;
    private Color primaryColor;
    private Color secondaryColor;
    private Color tertiaryColor;
    private Color quaternaryColor;
    private Color quinaryColor;

    /**
     * Default constructor for objects of class Visual
     */
    public Visual(Color backgroundColor, Color primaryColor, Color secondaryColor, Color tertiaryColor,Color quaternaryColor ,Color quinaryColor,int primeSpeed)
    {
        this.backgroundColor= backgroundColor;
        this.primarySpeed= primeSpeed;

        this.primaryColor= primaryColor;
        this.secondaryColor= secondaryColor;
        this.tertiaryColor= tertiaryColor;
        this.quaternaryColor= quaternaryColor;
        this.quinaryColor= quinaryColor;
    }

    public Color getBackgroundColor(){
        return backgroundColor;
    }

    public int getPrimarySpeed(){
        return primarySpeed;

    }

    
    public Color getPrimaryColor(){
        return primaryColor;
    }

    public Color getSecondaryColor(){
        return secondaryColor;
    }

    public Color getTertiaryColor(){
        return tertiaryColor;
    }

    public Color getQuaternaryColor(){
        return quaternaryColor;
    }

    public Color getQuinaryColor(){
        return quinaryColor;
    }

}

