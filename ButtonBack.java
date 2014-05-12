import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonBack extends Button
{
    public void act() 
    {
        super.act();
        prepare();
    }    
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
           
            Greenfoot.setWorld(new HomeScreen());
            
        }
    }
    
    public void prepare(){
    
    
    }
}
