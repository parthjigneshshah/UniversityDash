import java.util.ArrayList;

public class ConcreteSubject implements PersonSubject
{
    protected int subjectState;
    private ArrayList<PlayerObserver> observers = new ArrayList<PlayerObserver>();
    
    public int getState(){return subjectState;}
    
    public void setState(int state){
        subjectState = state;
        notifyObservers();         
    }
    
    public Boolean highestHand(String hand){
        if(hand == "Right")
            return true;
        else 
            return false;
    }
    
    public int nearestJoint(String joint){
        if (joint == "Right Foot") return 1;
        else if (joint == "Left Foot") return 2;
        else if (joint == "Elbow") return 3;
        else return 4;
    }
    public int translateGestures(String highHand, String joint){
        
        int nearJoint = nearestJoint(joint);
        
        if(highestHand(highHand)){
            if(nearJoint == 1){ subjectState = 1;}//Student Quadrant 1
            else if(nearJoint == 2){subjectState = 2;}//Student Quadrant 2 
            else if(nearJoint == 3){subjectState = 3;}//Student Quadrant 3
            else if(nearJoint == 4){subjectState = 4;}//Student Quadrant 4
        } else {
            if(nearJoint == 1){ subjectState = 5;}//Tutor Quadrant 1
            else if(nearJoint == 2){subjectState = 6;}//Tutor Quadrant 2
            else if(nearJoint == 3){subjectState = 7;}//Tutor Quadrant 3
            else if(nearJoint == 4){subjectState = 8;}//Tutor Quadrant 4        
        }  
        
        return subjectState;
    }
    public void notifyObservers() {
        for (PlayerObserver obj  : observers)
        {
            obj.update();
        }
    }
    public void attach(PlayerObserver person){ observers.add(person);}
    public void detach(PlayerObserver person){ observers.remove(person) ;}

    public void showState() { 
        if(this.getState() == 0)
            System.out.println("Nothing happens");
        else
            System.out.println( "State: " + subjectState );
        }
}
