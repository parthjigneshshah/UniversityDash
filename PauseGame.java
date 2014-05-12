public class PauseGame extends GestState 

{
    public PauseGame ( GestManager gm) { super (gm); }
    
    @Override
    public void doPause(){gestMngr.setState(GestStates.PAUSE);}
    
    @Override
    public void doQuit(){gestMngr.setState(GestStates.QUIT);}
    
    @Override
    public void doMovePerson(int personState){gestMngr.setState(GestStates.MOVE); t.setState(personState);}
    
}
