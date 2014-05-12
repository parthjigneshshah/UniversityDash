import greenfoot.*;
/**
 * Write a description of class StudentMgr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class StudentMgr implements Observer
{
    

    
    // instance variables - replace the example below with your own

   private static World worldobj;
   private static Queue queueobj;
   //private World world;
   private Student student;
   private Queue queue;
   private Dashy dashy;
   //private TableManager;
   private static StudentMgr studentManager;
   private TableTimeOutState tableTimeOutState;
   private static Table table;
   private static TableState tableState;
    // * Constructor for objects of class StudentMgr
   /*  
    public StudentMgr(World world, Queue queue)
    {
       this.world = world;
       this.queue = queue;
             
        
    }
    */
    public StudentMgr(World world,Queue queue)
    {
        worldobj = world;
        queueobj = queue;
        
    }
    
    public static StudentMgr getStudentManager()
    {
        if((studentManager == null))
             {
                 studentManager = new StudentMgr(worldobj,queueobj);
             }
                return studentManager;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void moveStudent(int tableNo)
    {

        Table table = TableManager.getTable(tableNo);
        
        if (!(table.getTableState() instanceof EmptyTableState)){
            return;
        }
        
        int x,y = 0; 
        student = queueobj.getNextStudent();
        
        
        if (student == null)
          return;
          
        TableManager.studentSeated(tableNo, student.getStudentType(),student);
        
        //System.out.println("Inside movestudent"+student);
        boolean placed = false;
        
        if (tableNo == 1)
        {
            x = 350;
            y = 332;
            worldobj.addObject(student,401,230);
            student.setFlag(true,tableNo);
            
           // placed = student.getStudentToTable(x,y);
        }
        else if(tableNo == 2)
        {
            x = 541;
            y = 336;
            worldobj.addObject(student,402,230);
            student.setFlag(true,tableNo);
            //placed = student.getStudentToTable(x,y);
        }
        else if(tableNo == 3)
        {
            x = 298;
            y = 453;
            worldobj.addObject(student,403,230);
            student.setFlag(true,tableNo);
            //placed = student.getStudentToTable(x,y);
        }
        else if(tableNo == 4)
        {
            x = 516;
            y = 461;
            worldobj.addObject(student,404,230);
            student.setFlag(true,tableNo);
            //placed = student.getStudentToTable(x,y);
            
        }
        
        
        
        
    }
   
    
    public void update(Table table){
       
        if(table.getTableState() instanceof TableTimeOutState)
         
         {
            int chairX = table.getStudent().getChairX(); 
            int chairY = table.getStudent().getChairY();
            worldobj.removeObject(table.getStudent());
            worldobj.addObject(new EmptyChair(table.getTableNo()),chairX, chairY);
         }
    }




}