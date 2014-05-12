public class MovePerson extends GestState 
{
    public MovePerson ( GestManager gm) { super (gm); }
    
    @Override
    public void doPause(){gestMngr.setState(GestStates.PAUSE);}
    
    @Override
    public void doQuit(){gestMngr.setState(GestStates.QUIT);}
    
    @Override
    public void doMovePerson(int personState){gestMngr.setState(GestStates.MOVE); System.out.println("In MovePerson State");  t.setState(personState);}

    @Override
    public void doNothing(){gestMngr.setState(GestStates.NOTHING); t.setState(0);}
}
