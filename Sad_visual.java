import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.geom.*;
/**
 * Write a description of class Sad_visual here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sad_visual extends Visual
{
    /** description of instance variable x (add comment for each instance variable) */
    private Color backgroundColor;
    private int primarySpeed;

    
    /**
     * Default constructor for objects of class Sad_visual
     */
    public Sad_visual()
    {
        //Constructs Sad Visual
        super(Color.black,Color.blue, Color.cyan, new Color(89,15,132),new Color(9,19,82),new Color(94,129,225), 100);

        
    }

    public void drawCircles(Graphics2D g2){

        //Constructs random circles within the area;
        Ellipse2D.Double tempCirc= new Ellipse2D.Double(Math.random()*1000-100,Math.random()*1000-100,(+10)*(8), (14)*(9));

        g2.draw(tempCirc);
        g2.fill(tempCirc);
        //Draws and fills circles

    
    }

    public void drawRipples(Graphics2D g2, int layer){
        layer= 100- layer;
        int length= (int) Math.random()*layer*10+10;
        Ellipse2D.Double centCirc= new Ellipse2D.Double(250-(length*layer/4),250-(length*layer/4), length*layer,length*layer);

        //Calculates the circle using the given layer;

        g2.draw(centCirc);
        g2.fill(centCirc);
        //draws cricle
        g2.setColor(Color.black);
        drawOutLine(g2,centCirc);
        //draws outline

    }

    public static void drawOutLine(Graphics2D g2, Ellipse2D circ){
        Ellipse2D.Double circle= new Ellipse2D.Double(circ.getX()-1, circ.getY()-1, circ.getHeight()+1, circ.getWidth()+1);
        g2.draw(circle);
        //uses instance variable circle and makes it one bigger
    }

    public void drawWaves(Graphics2D g2, int layer){
        CubicCurve2D.Double wave;
        for(int i=0; i<10; i++){
            if (layer%2==0){
                wave= new CubicCurve2D.Double(layer*10+i,0, layer*10+50, 333, layer*10-50, 666, layer*10+i, 999);
            }
            else{
                wave= new CubicCurve2D.Double(layer*10+i,0, layer*10-50, 333, layer*10+50, 666, layer*10+i, 999);

            }
            g2.draw(wave);
        }

    }

    public void drawDrops(Graphics2D g2, int layer){
        
        Ellipse2D.Double drop= new Ellipse2D.Double( 500 ,0+layer, 50, 50);
        
    }

    public void move(){
    }
}
