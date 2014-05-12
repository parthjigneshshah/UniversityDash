import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TableTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableTimer extends Actor implements Observer
{
    /**
     * Act - do whatever the TableTimer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time;
    private boolean decrement;
    private static final int FREQUENCY = 20;
    private Table table;
    private int[][] starLocation = {{311, 259},{598, 256},{518, 424},{184, 412}};
    public TableTimer(){
    }
    
     
       
    public void setTime (int studentType){
        switch (studentType){
            case 0: time = 15020;//english
              break;
            case 1: time = 10020;//general
              break;
            case 2: time = 15020; //math
              break;
            case 3: time = 20020;//science
              break;
        }
        decrement = true;
    }
    
    public void act() 
    {
           
        // This code is for testing timer and should be removed afterwards
       /*if(Greenfoot.mousePressed(this))
        {
            UniversityDash.getTableManager().studentSeated(0,2);
        }*/
        // Add your action code here.
        if (decrement) {
         time -= FREQUENCY;
         
         if (time < 0) {
             decrement = false;
             time = 0;
             table.timeOut();
             return; // call timeout
        }
        
        // int mod = time % 1000;

        // if (mod == 0) {
             int index = time / 1000;
             setImage(ImageLoader.getTimerImage(index));
         //}
       }
    }    
    
    public void addStar(int tableNo)
    {
        Star star = new Star();
        getWorld().addObject(star,starLocation[tableNo-1][0],starLocation[tableNo-1][1]);
    }
    
    private GreenfootSound music = new GreenfootSound("half-time.mp3");
    
    public void update(Table table){
       this.table = table;
       TableState state = table.getTableState();
       //update time based on time left
       if (state instanceof EmptyTableState){
          time = 0;
       }else if (state instanceof TableHasTutorState){
          time *= 0.4;
          music.play();
          addStar(table.getTableNo());
          table.setTimeSaved(time);
       }
    }
}
