 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Actor
{
    
    static int table = 1;
    static int st = 0;
    boolean flagcheck = false;
    int tableNo=1;
    int count=0;
    private UniversityDash worldobj;
    private int[][] chairLocation = {{400,337},{650,337},{266,471},{546,471}};
    int chairX = 0;
    int chairY = 0;
    
    /**
     * Act - do whatever the Student wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int studentType;



    
    public Student(){
           worldobj = UniversityDash.getUniversityDash();
    }

    public Student(int studentType){
      this.studentType = studentType;
    }
    
    public int getStudentType(){
        return studentType;
    }
    
    public void setFlag(boolean flag,int no)
    {
        //System.out.println(flag+"The value of flag is");
        
        //System.out.println("The flag value"+flag+" the table no"+no);
        tableNo = no;
        flagcheck = flag;
        //act();
    }
    
    
   public boolean getStudentToTable(int x, int y)
   {

       System.out.println("in the student object");

   
    return true;
    }

    public void act() 
    {
             int x=0,y=0;
        
        if(flagcheck && count<110)
        {
            switch(tableNo)
            {
              case 1:
              x= 435;y= 337;
              break;
              
              case 2:
              x=692;y=348;
              break;
              
              case 3:
              x=611;y=460;
              break;
              
              case 4:
              x=313;y=462;
              break;
                      
            }
            
            adjustStudentLocation(x,y,tableNo);
        }
      
    } 
    
    
    private void adjustStudentLocation(int x,int y,int tableNo)
    {
         move(-5);
        
        count = count+5;
        if(count == 110)
        {
          //  turn(90);
          
          setLocation(x,y);
          
          changeStudentImage();
           EmptyChair emptyChair = getEmptyChair(tableNo);
           chairX =  emptyChair.getX();
           chairY =  emptyChair.getY();   
           System.out.println("X coordinates:"+chairX+"y coordinates"+chairY);
           
          getWorld().removeObject(emptyChair);
           
          TableManager.studentSeated(tableNo,st++,this);
         
        }
    
    }
    
    
    private EmptyChair getEmptyChair(int chairNo)
    {
        List<EmptyChair> list = getWorld().getObjects(EmptyChair.class);
        for(EmptyChair chair: list)
        {
            if(chair.getChairNo() == chairNo)
            return chair;
        }
        
        return null;
    }
    
      public void  changeStudentImage(){
        
          if(this instanceof StudentA )
        {
            setImage("student1sitting.png");
        }
         if(this instanceof StudentB )
        {
            setImage("student2sitting.png");
        }
         if(this instanceof StudentC )
        {
            setImage("student3sitting.png");
        }
         if(this instanceof StudentD )
        {
            setImage("student4sitting.png");
        }
       
          
    }
       
    public int getChairX(){
    return chairX;
    }
    
    public int getChairY(){
    return chairY;
    }
}
