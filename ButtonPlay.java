import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonPlay extends Button
{
    /**
     * Act - do whatever the ButtonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        prepare();
    }    
    public void click()
    {
        if(Greenfoot.mouseClicked(this)){
           
            Greenfoot.setWorld(new UniversityDash());
            
        }
    }
    
    public void prepare(){
    
    
    }
    
}
