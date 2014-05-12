/**
 * Write a description of class EmptyQueueState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyQueueState implements QueueState
{
    private Queue queue;
    public EmptyQueueState(Queue q){
        this.queue = q;
    }
    
    public Student addStudent(){
        queue.setState(queue.getHasStudentState());
        return StudentFactory.getInstance().createStudent();
    }
    public void removeStudent(){}   
}
