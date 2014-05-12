import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaintingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaintWorld extends KinectWorld
{
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;
    
    private long leftHandUp;
    private Label leftHandWarning;

    public PaintWorld()
    {    
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        //super(850,600,1,false);
        
        final int width = getWidth();
        final int height = getHeight();
        
        addObject(new Brush(width, height), width/2, height/2);
        addObject(new Instructions(), width/2, height/2);
        addObject(new Thumbnail(), width - THUMBNAIL_WIDTH/2, height - THUMBNAIL_HEIGHT/2);
        
        Label instr = new Label("Use your right hand to paint, raise left hand to clear.", 20);
        addObject(instr, instr.getImage().getWidth() / 2, getBackground().getHeight() - (instr.getImage().getHeight() / 2));
    }
    
    private boolean calibrationDone = false;

    public void act()
    {
        super.act();
        if (!isConnected())
            return;
        
        UserData[] us = getTrackedUsers();
        
        if (calibrationDone){
           return;
        }else{
           for(UserData u: us){
           if (!u.isCalibrating()) {
             calibrationDone = true;
             prepare();
             start();
             
           }
        }
             
        }
            
        
      //  getBackground().setColor(java.awt.Color.WHITE);
      //  getBackground().fill();
        
        boolean anyLeftHandUp = false;
        
        for (UserData u: us)
        {
        
            //Draws their stick figure:
           // u.drawStickFigure(getBackground(), 60);
            
            anyLeftHandUp = anyLeftHandUp || (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY());
        }
        
        // This is extra code used to warn the user if any of them is keeping their
        // left hand in the air, which effectively prevents any painting because
        // the brush will be cleared every frame:        
        if (anyLeftHandUp)
        {
            if (leftHandUp == -1)
            {
                leftHandUp = System.currentTimeMillis();
            }
            else
            {
                if (System.currentTimeMillis() - leftHandUp > 5000 && leftHandWarning == null)
                {
                    leftHandWarning = new Label("Put your left hand down to stop clearing the screen.", 40);
                    addObject(leftHandWarning, getWidth() / 2, getHeight() / 2);
                }
            }
        }
        else
        {
            leftHandUp = -1;
            if (leftHandWarning != null)
            {
                removeObject(leftHandWarning);
                leftHandWarning = null;
            }
        }
    }
    
    private void prepare()
    {
        setBackground("Classroom.jpg");

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
}
