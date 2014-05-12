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

    private static TableManager tm;
    private EmptyChair emptyChair;
    private List<EmptyChair> chairList = new <EmptyChair>ArrayList();
    private static UniversityDash instance;
    public static TableManager getTableManager()
    {
        return tm;
    }
    
    public UniversityDash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 600, 1); 
        prepare();
    }
    
    
    
    public static UniversityDash getUniversityDash()
    {
        if(instance == null)
        {
            instance = new UniversityDash();
        }
    
        return instance;
        
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
      tm = new TableManager(this,tutorManager, scoreManager, studentManager);   
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Dashy dashy = new Dashy();
        addObject(dashy, 279, 231);

        Table table = new Table();
        addObject(table, 350, 382);

        dashy.setLocation(283, 213);
        dashy.setLocation(288, 210);

        table.setLocation(325, 370);

        Table table2 = new Table();
        addObject(table2, 621, 328);

        Table table3 = new Table();
        addObject(table3, 403, 525);
        table3.setLocation(406, 497);
        table.setLocation(325, 356);
        table.setLocation(321, 356);
        table3.setLocation(379, 488);
        Table table4 = new Table();
        addObject(table4, 662, 482);
        table2.setLocation(604, 342);
        table.setLocation(353, 357);
        table3.setLocation(206, 492);
        table4.setLocation(474, 505);
        table2.setLocation(589, 363);
        TableTimer tabletimer = new TableTimer();
        addObject(tabletimer, 328, 303);
        TableTimer tabletimer2 = new TableTimer();
        addObject(tabletimer2, 558, 308);
        TableTimer tabletimer3 = new TableTimer();
        addObject(tabletimer3, 181, 435);
        TableTimer tabletimer4 = new TableTimer();
        addObject(tabletimer4, 448, 454);
        tabletimer.setLocation(323, 284);
        tabletimer.setLocation(323, 283);
        tabletimer.setLocation(316, 329);
        tabletimer2.setLocation(553, 344);
        tabletimer3.setLocation(168, 463);
        tabletimer4.setLocation(440, 477);
        removeObject(tabletimer);
        removeObject(tabletimer2);
        removeObject(tabletimer4);
        removeObject(tabletimer3);
        TableTimer tabletimer5 = new TableTimer();
        addObject(tabletimer5, 326, 338);
        tabletimer5.setLocation(319, 334);
        TableTimer tabletimer6 = new TableTimer();
        addObject(tabletimer6, 562, 347);
        tabletimer6.setLocation(554, 342);
        TableTimer tabletimer7 = new TableTimer();
        addObject(tabletimer7, 456, 488);
        tabletimer7.setLocation(437, 480);
        TableTimer tabletimer8 = new TableTimer();
        addObject(tabletimer8, 177, 468);
        tabletimer8.setLocation(169, 468);
        tabletimer5.setLocation(316, 332);
        tabletimer5.setLocation(297, 314);
        tabletimer6.setLocation(528, 322);
        tabletimer7.setLocation(416, 463);
        tabletimer6.setLocation(538, 320);
        tabletimer5.setLocation(301, 315);
        tabletimer8.setLocation(154, 450);
        tabletimer7.setLocation(425, 461);
        tabletimer7.setLocation(425, 463);
        table.setLocation(376, 325);
        tabletimer5.setLocation(329, 283);
        table.setLocation(375, 328);
        table2.setLocation(594, 330);
        table2.setLocation(590, 342);
        tabletimer6.setLocation(548, 300);
        table3.setLocation(255, 454);
        table.setLocation(369, 341);
        tabletimer5.setLocation(324, 300);
        tabletimer8.setLocation(207, 413);
        table4.setLocation(479, 484);
        tabletimer7.setLocation(436, 437);
        table4.setLocation(483, 473);
        tabletimer7.setLocation(439, 431);
        table2.setLocation(578, 346);
        table4.setLocation(543, 460);
        tabletimer7.setLocation(500, 417);
        table2.setLocation(627, 344);
        tabletimer6.setLocation(584, 302);
        Tutor tutor = new Tutor();
        addObject(tutor, 184, 326);

        EmptyChair emptychair = new EmptyChair(1);
        addObject(emptychair, 435, 337);
        EmptyChair emptychair2 = new EmptyChair(2);
        addObject(emptychair2, 692, 348);
        EmptyChair emptychair3 = new EmptyChair(3);
        addObject(emptychair3, 611, 460);
        EmptyChair emptychair4 = new EmptyChair(4);
        addObject(emptychair4, 313, 462);
    }
    
    public EmptyChair getEmptyChair(){
        
        return emptyChair;
    }
    public List<EmptyChair> getEmptyChairList(){
    
        return chairList;
    }

}
