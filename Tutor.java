import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Tutor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutor extends Actor
{
    /**
     * Act - do whatever the Tutor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String [] images = {"tutorFrontSmall.png", "tutorBackSmall.png"};
    private int[][] coordinates = {{360,393},
                                   {720,393},
                                   {720,393},
                                   {360,393}};
    
    private int currentImage = 0;                                   

    int count=0;
    boolean flagcheck=false;
    Tutor tutor;
    Tutor tutorobj;
    World worldobj;
    List<Tutor> tutors;
    List<Tutor> tempList;
    int tableNo;
    
    
    public Tutor() {           
    }
    
    public Tutor(Table table){
    }
    
    public void setFlag(boolean flag,int no)
    {
        //System.out.println(flag+"The value of flag is");
        tableNo = no;
        flagcheck = flag;
        count = 0;
        //act();
    }
  
    public void act() 
    {
        
        if (flagcheck){
           
            if (this.getX() < coordinates[tableNo-1][0]){
                move(15);
            }
            else {
              TableManager.tutorArrived(tableNo);
              flagcheck = false;
              String image = tableNo < 3 ? images[1] : images[0];
              setImage(image);
              
              if (tableNo > 2)
                setLocation(getX(), getY() + 30);
            }
        
        }      
        
        if(Greenfoot.mouseClicked(this))
        {   //System.out.println(worldobj);
           TutorManager tutorManager = TutorManager.getTutorManager();
           tutorManager.moveTutor(new Random().nextInt(4) + 1);
        }
 
        
        // Add your action code here.
    }    
    
    public void reset(){
        setLocation(184,393);
        setImage(images[0]);
    }
}
