public class Nothing extends GestState 

{
    public Nothing ( GestManager gm) { super (gm); }
    
    @Override
    public void doPause(){gestMngr.setState(GestStates.PAUSE);}
    
    @Override
    public void doQuit(){gestMngr.setState(GestStates.QUIT);}
    
    @Override
    public void doMovePerson(int personState)
    {
        gestMngr.setState(GestStates.MOVE); 
        
        if(personState<=4)
            t.attach(tutor);
        else   
            t.attach(student);
            
        t.setState(personState);
    }
    
}
