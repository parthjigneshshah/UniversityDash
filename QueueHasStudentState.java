/**
 * Write a description of class QueueHasStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueHasStudentState implements QueueState
{
    private Queue queue;
    public QueueHasStudentState(Queue q){
        this.queue = q;
    }
    
    public Student addStudent(){    
        if (queue.size () == (Queue.MAX_SIZE - 1)){
            queue.setState(queue.getQueueFullState());
        }
        return StudentFactory.getInstance().createStudent();
    }
    
    public void removeStudent(){
        if (queue.size() == 0) {
          queue.setState(queue.getEmptyQueueState());
        }
    } 
}
