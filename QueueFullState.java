/**
 * Write a description of class QueueFullState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueFullState implements QueueState
{
    private Queue queue;
    public QueueFullState(Queue q){
        this.queue = q;
    }
    
    public Student addStudent(){
      return null;
    }
        
    public void removeStudent(){
       queue.setState(queue.getHasStudentState());
    } 
}
