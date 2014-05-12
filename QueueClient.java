/**
 * Write a description of class QueueClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.*;
public class QueueClient implements Runnable
{
    private static Queue queue;
    private static final int DELAY = 3000;
    QueueClient(Queue queue){
       this.queue = queue;    
    }
    public void run(){
        while (true){
            try {
             Thread.sleep(DELAY);
             queue.addStudent();
            }
           catch (InterruptedException e){
           }
        }
    }
    
    public static void removeStudent(){
       queue.getNextStudent();
    }
}
