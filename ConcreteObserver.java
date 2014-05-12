public class ConcreteObserver implements PlayerObserver
{
    protected int tableState;
    protected ConcreteSubject subject;
   
    public ConcreteObserver(ConcreteSubject theSubject)
    {
       this.subject = theSubject;
    }

    public void update() {
        // do nothing
    }
}
