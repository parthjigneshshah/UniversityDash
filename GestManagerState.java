public interface GestManagerState
{
    public abstract void doPause();
    public abstract void doQuit();    
    public abstract void doMovePerson(int personState);    
    public abstract void doNothing();       
}
