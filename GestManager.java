
public class GestManager
{
    GestState pauseState;
    GestState quitState;
    GestState movePersonState; 
    GestState nothingState;
    GestState currentState;
    
    public GestManager()
    {
        pauseState = new PauseGame(this);
        quitState = new QuitGame(this);
        movePersonState = new MovePerson(this);
        nothingState = new Nothing(this);
        currentState = nothingState;
    }
    
    public void pause(){System.out.println("Pausing Game..."); currentState.doPause();}
    
    public void quit(){System.out.println("Quiting Game..."); currentState.doQuit();}
    
    public void movePerson(int personState){System.out.println("Moving Tutor or Person..."); 
        currentState.doMovePerson(personState); 
    }
    
    public void nothing(){System.out.println("Nothing..."); currentState.doNothing();}    
    
    void setState(GestStates nextState){
        switch (nextState) {
            case PAUSE : currentState = pauseState; break;
            case QUIT : currentState = quitState; break;
            case MOVE : currentState = movePersonState; break;
            case NOTHING : currentState = nothingState; break;            
        }                
    }
    
    public void showState(){System.out.println("Current State: " + currentState.getClass().getName());}
}
