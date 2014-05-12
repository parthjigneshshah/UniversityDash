import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.awt.Font;
import java.awt.Color;
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ScoreManager sm = new ScoreManager();
    public Scoreboard() {        
    }
    
    

    public void act() 
    {
        int score = sm.updateScore();
            
        GreenfootImage image = new GreenfootImage(460,200);
        image.setColor(Color.RED);
        float fontSize = 18;    
        Font font = image.getFont().deriveFont(fontSize);  
        image.setFont(font);  
          
        image.drawString("Score: " + score, 120,150 );  
        setImage(image);  
    }    
}
