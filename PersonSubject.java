public interface PersonSubject
{
    public abstract Boolean highestHand(String person);
    public abstract int nearestJoint(String joint);
    public abstract int translateGestures(String highHand, String joint);
    public abstract void attach(PlayerObserver obj);
	public abstract void detach(PlayerObserver person);
	public abstract void notifyObservers();
}
