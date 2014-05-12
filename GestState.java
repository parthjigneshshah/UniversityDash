public class GestState implements GestManagerState
{
    GestManager gestMngr;
    Person t = new Person(0);
    TutorObs tutor = new TutorObs(t);
    StudentObs student = new StudentObs(t);
    
    public GestState(GestManager gm){ gestMngr = gm;}
    
    public void doPause(){System.out.println("Pausing is not valid in " + this.getClass().getName() + "state.");}
    public void doQuit(){System.out.println("Quitting is not valid in " + this.getClass().getName() + "state.");}    
    public void doMovePerson(int personState){System.out.println("Moving a person is not valid in " + this.getClass().getName() + "state.");}   
    public void doNothing(){System.out.println("Doing nothing is not valid in " + this.getClass().getName() + "state.");}
}
