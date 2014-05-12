
/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import greenfoot.*;

public class Queue  
{
   private LinkedList<Student> queue;
   private QueueState state;
   private EmptyQueueState emptyQueueState;
   private QueueHasStudentState hasStudentState;
   private QueueFullState queueFullState;
   private World world;
   
   public static final int MAX_SIZE = 6;
   private int nextX = 420;
   private int y = 210;
   
   public Queue(World world) {
      this.world = world;
      queue = new LinkedList<Student>();
      emptyQueueState = new EmptyQueueState(this);
      hasStudentState = new QueueHasStudentState(this);
      queueFullState = new QueueFullState(this);
      state = emptyQueueState;
   }
   
   public void setState(QueueState queueState){
      this.state = queueState; 
   }
   
   public EmptyQueueState getEmptyQueueState(){
     return emptyQueueState;    
   }   
   
   public QueueHasStudentState getHasStudentState(){
     return hasStudentState;    
   }   
   
   public QueueFullState getQueueFullState(){
     return queueFullState;    
   }
   
   public void addStudent(){
       Student student = state.addStudent();
       if (student != null){
         queue.add(student);
         //logic to add to world
         world.addObject(student, nextX, y);
         nextX += 70;
      }
       
   }
   
   public Student getNextStudent(){
       Student student = queue.poll();
      
       if (student == null)
        return null;
        
       world.removeObject(student);
       nextX -= 70;
       for (Student s: queue){
         s.move(-70);
       }
       state.removeStudent();
       return student;
   }
   
   public int size(){
      return queue.size();    
   }
}
