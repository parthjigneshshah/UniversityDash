import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonInstructions extends Button
{
    /**
     * Act - do whatever the ButtonInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         super.act();
    }    
    
     public void click()
    {
        if(Greenfoot.mouseClicked(this)){
            
            getWorld().addObject(new Instructions(),300,250);
           
            
            
            
        }
    }
}
