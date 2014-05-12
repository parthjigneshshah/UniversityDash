/**
 * Write a description of class TableManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import greenfoot.*;

public class TableManager  
{
   private static List<Table> tables = new ArrayList<Table>();
   private World world;
   private static GreenfootSound studentSeatMusic = new GreenfootSound("seat-student.wav");
   
   public TableManager(World world, TutorManager tutorManager, ScoreManager scoreManager, StudentMgr studentManager){
       this.world = world;
       init(tutorManager,scoreManager,studentManager);
   }
   
   private void init(TutorManager tutorManager, ScoreManager scoreManager, StudentMgr studentManager){
      tables = world.getObjects(Table.class); 
      List<TableTimer> tableTimers = world.getObjects(TableTimer.class);
      int i = 0;
      for (Table table: tables){
         TableTimer timer = tableTimers.get(i++);
         table.setTableTimer(timer);
         table.setTableNo(i);
         table.attach(timer);
         table.attach(studentManager);
         table.attach(tutorManager);
         table.attach(scoreManager);
      }
   }
   
   public static void studentSeated(int tableNo, int studentType, Student student){
       studentSeatMusic.play();
       Table table = tables.get(tableNo - 1);
       table.seatStudent(studentType,student);
   }
   
   public static void tutorArrived(int tableNo){
      //System.out.println("Tutor arrived: " + tableNo);
      Table table = tables.get(tableNo - 1);
      table.tutorStudent();
   }
   
   public static void vacateTable(Table table)
   {
       if (table != null) {
         table.vacateTable();
       }
   }
    
   public static Table getTable(int tableNo){
       return tables.get(tableNo - 1);
    }
}
