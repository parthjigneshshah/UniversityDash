public class TutorObs extends ConcreteObserver 
{
    
    public TutorObs(ConcreteSubject sub)
    {
       super(sub);
    }

    public void update(){
       tableState = subject.getState();
       if (tableState == 0 || tableState > 4)
            System.out.println("Tutor does nothing.");
       else if(tableState <= 4){
            System.out.println("Moving tutor to table " + subject.getState());//move tutor to table #X
            TutorManager.moveTutor(tableState);
        }
    }        
    
    public void showState()
    {
        tableState = subject.getState();
        if (tableState == 0 || tableState > 4)
            System.out.println("Tutor does nothing.");
       else if(tableState <= 4)
            System.out.println( this.getClass().getName() + " moves to table " + tableState );
    }
}
