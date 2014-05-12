import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class EmptyChair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyChair extends Actor
{
    private static World worldobj;
    private Student student;
    private int chairNo;
    
    /**
     * Act - do whatever the EmptyChair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public EmptyChair(int no)
    {
        this.chairNo = no;
    }
    
    public int getChairNo()
    {
        return chairNo;
    }
    
    public EmptyChair(World world){
     worldobj = world;    
    
    }
    public EmptyChair(){}
    public void act() 
    {
        // Add your action code here.
    }    
    
    
   
    }

