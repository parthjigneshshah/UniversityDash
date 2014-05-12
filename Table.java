import greenfoot.*;  
import java.util.*;


public class Table extends Actor implements Subject
{
    private TableState state;
    private TableState prevState;
    private EmptyTableState emptyTableState;
    private TableHasStudentState hasStudentState;
    private TableHasTutorState hasTutorState;
    private TableTimeOutState tableTimeOutState;
    private TableTimer timer;
    private List<Observer> observers = new ArrayList<Observer>();
    private Student student;
    private int timeSaved = 0;
    private int tableNo;
    
    
    public void setTableNo(int tableNo)
    {
        this.tableNo = tableNo;
    }
    
    public int getTableNo()
    {
        return this.tableNo;
    }
    
    public void setTimeSaved(int time)
    {
        this.timeSaved = time;
    }
    
    public int getSavedTime()
    {
        return timeSaved;
    }
    
    public void setTableState(TableState state){
       this.state = state;
       notifyObservers();
    }
    
    public void setPreviousState(TableState state)
    {
        this.prevState = state;
    }
    
    public TableState getPreviousState()
    {
        return prevState;
    }
    
    public void setTableTimer(TableTimer timer){
       this.timer = timer;
    }
        
    public TableState getTableState(){
       return state;
    }
    
    public TableState getTableTimeOutState()
    {
        return tableTimeOutState;
    }
    
    public Table(){
       emptyTableState = new EmptyTableState(this);
       hasStudentState = new TableHasStudentState(this);
       hasTutorState = new TableHasTutorState(this);
       tableTimeOutState = new TableTimeOutState(this);
       state = emptyTableState;
    }
    
    public EmptyTableState getEmptyTableState(){
        return emptyTableState;
    }
    
    public TableHasStudentState getHasStudentState(){
        return hasStudentState;
    }
    
    public TableHasTutorState getHasTutorState(){
        return hasTutorState;
    }
    
    public void act() 
    {
        
    }    
    
      public void attach(Observer o){
        observers.add(o);
    }
    
    public void detach(Observer o){
        observers.remove(o);
    }
    
    public void notifyObservers(){
       for (Observer o: observers){
           o.update(this);
       }
    }
    
    public Student getStudent(){
       return this.student;
    }
    
    public void seatStudent(int studentType, Student student){
        this.student = student;
        state.seat();
        timer.setTime(studentType);
    }
    
    public void tutorStudent(){
       state.tutor();
    }
    
    public void vacateTable(){
       timeSaved = 0; // time saved is reset after time out
       state.leave();
    }
    
    public void timeOut() {
        state.timeOut();
    }
}
