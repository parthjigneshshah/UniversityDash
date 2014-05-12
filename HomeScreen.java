import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class HomeScreen extends World
{
    private ButtonPlay buttonPlay;
    private ButtonInstructions buttonInstructions;
    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        buttonPlay = new ButtonPlay();
        buttonInstructions = new ButtonInstructions();
        prepare();
    }
    public void act()
    {

        Greenfoot.mouseClicked(buttonPlay) ;
        Greenfoot.mouseClicked(buttonInstructions) ;

    }
     public void prepare()
    {
        addObject(buttonPlay, 100, 50);
        addObject(new ButtonInstructions(), 450, 50);
       // addObject(new UniversityDash(), 300, 230);
        
    }
}
