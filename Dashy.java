import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Dashy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dashy extends Actor
{
    /**
     * Act - do whatever the Dashy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Random random = new Random();
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            int next = random.nextInt(4) + 1;
            StudentMgr studentManager = StudentMgr.getStudentManager();
            studentManager.moveStudent(next);      
        }        
    }    
  
}
