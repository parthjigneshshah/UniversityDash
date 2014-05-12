/**
 * Write a description of class TutorManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;
import java.util.*;

public class TutorManager  implements Observer
{
    private static TutorManager tutorManager;
    private static Tutor tutor;
    private static World worldobj;
    boolean flag=true;
    int temp =0;
    Table tableObj;
    TableState hasTutorState;
    public TutorManager(World world)
    {
        
        worldobj = world;
        List<Tutor> tutors = world.getObjects(Tutor.class);
        tutor = tutors.get(0);       
    }
    
    public static TutorManager getTutorManager()
    {
        if(tutorManager == null)
        {
            tutorManager = new TutorManager(worldobj);
        }
        return tutorManager;
    }
    
    public void update(Table table)
    {
       TableState currentState = table.getTableState();
       
       if (currentState instanceof TableTimeOutState){
          TableState tableState = table.getPreviousState(); 

            if(tableState instanceof TableHasTutorState)
             {
                if(tutor != null)
               {
                   tutor.reset();
               }
            }
             table.vacateTable();
         }   
     }
       
    public static void moveTutor(int tableNo)
    {
        Table table = TableManager.getTable(tableNo);
        TableState currentState = table.getTableState();
        if(currentState instanceof TableHasStudentState)
        {
        tutor.setFlag(true,tableNo);//TableManager.tutorArrived(tableNo);    
        }
        else
        {
        }
    }
    
    
}
