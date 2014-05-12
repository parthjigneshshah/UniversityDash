public class StudentObs extends ConcreteObserver
{
    public StudentObs(ConcreteSubject sub)
    {
        super(sub);
        studentManager = StudentMgr.getStudentManager();
    }
    
    private StudentMgr studentManager;

    public void update(){
       tableState = subject.getState();// moveStudent(subject.getState());
       if (tableState == 0 || tableState <= 4)
            System.out.println("Student does nothing");
       else if(tableState > 4){
            System.out.println("Moving student to table " + subject.getState());//move tutor to table #X
            studentManager.moveStudent(tableState-4);
        }
    
    } 
    
    public void showState(){
       tableState = subject.getState();// moveStudent(subject.getState());
       if (tableState == 0 || tableState <= 4)
            System.out.println("Student does nothing");
       else if(tableState > 4)
            System.out.println( this.getClass().getName() + " moves to table " + tableState );    
    }
}



