import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UniversityDash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)

 */
import java.util.*;

public class UniversityDash extends World
{

    
    
    public UniversityDash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 600, 1); 
        prepare();
    }
    
    public void started(){
      start();
    }
    
    private void start(){
      //start the queue client and pass queue object
      Queue queue = new Queue(this);
      Thread thread = new Thread(new QueueClient(queue));
      thread.start();
      TutorManager tutorManager = new TutorManager(this);
      ScoreManager scoreManager = new ScoreManager();
      StudentMgr studentManager = new StudentMgr(this,queue);
      TableManager tm = new TableManager(this,tutorManager, scoreManager, studentManager);   
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Dashy dashy = new Dashy();
        addObject(dashy, 288, 210);

        Table table = new Table();
        addObject(table, 384, 320);
        Table table2 = new Table();
        addObject(table2, 658, 322);
        Table table3 = new Table();
        addObject(table3, 235, 508);
        Table table4 = new Table();
        addObject(table4, 598, 503);

        TableTimer tabletimer5 = new TableTimer();
        addObject(tabletimer5, 337, 278);
        tabletimer5.setLocation(319, 334);
        TableTimer tabletimer6 = new TableTimer();
        addObject(tabletimer6, 615, 281);
        TableTimer tabletimer7 = new TableTimer();
        addObject(tabletimer7, 551, 469);
        TableTimer tabletimer8 = new TableTimer();
        addObject(tabletimer8, 188, 468);

        Tutor tutor = new Tutor();
        addObject(tutor, 182, 393);

        Scoreboard sb = new Scoreboard();
        addObject(sb, 150, 100);

        EmptyChair emptychair = new EmptyChair(1);
        addObject(emptychair, 455, 306);
        EmptyChair emptychair2 = new EmptyChair(2);
        addObject(emptychair2, 747, 306);
        EmptyChair emptychair3 = new EmptyChair(3);
        addObject(emptychair3, 697, 500);
        EmptyChair emptychair4 = new EmptyChair(4);
        addObject(emptychair4, 326, 493);
        tabletimer5.setLocation(344, 278);
        tabletimer7.setLocation(554, 462);
    }
}
