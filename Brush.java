import greenfoot.*;

public class Brush extends Actor
{
  
    int  framesNearTarget;
    boolean ashleysIdea = false;
    
    
    public Brush(int width, int height)
    {
        setImage(new GreenfootImage(width, height));
        getImage().setColor(java.awt.Color.GREEN);
    }

    public void act() 
    {
        PaintWorld world = (PaintWorld)getWorld();
        UserData user = world.getTrackedUser();
        String highJoint="h";
        int timer=0;
           
        LeftHandState left = new LeftHandState(user);
        RightHandState right = new RightHandState(user);
        gestTarget adapter = new gestAdapter();
        String gest1 = "";
        String gest2 = "";
        int gestState = 0;
    //    String gest1;
      // String gest2;
         //Joint rightHand = user.getJoint(Joint.RIGHT_HAND);
          //  getImage().fillOval(rightHand.getX(), rightHand.getY(), 20, 20);
            
          if(ashleysIdea ==false)
          {
         try  
          {
            if (left.handCheck().equals("Left")&&  user.getNearestJoint()==Joint.RIGHT_HAND && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.RIGHT_FOOT
            {
               System.out.println("Tutor First Quadrant");
               gest1 = "Left Hand";
               gest2 = "Right Hand";
               adapter.gestTranslator(gest1,gest2, gestState);
               ashleysIdea = true;
            }
            else if (left.handCheck().equals("Left")&&  user.getNearestJoint()==Joint.RIGHT_FOOT && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.RIGHT_FOOT
            {
                System.out.println("Tutor Second Quadrant");
                gest1 = "Left Hand";
                gest2 = "Right Foot";
                adapter.gestTranslator(gest1,gest2, gestState);
                ashleysIdea = true;
            }
            else if(left.handCheck().equals("Left") &&  user.getNearestJoint()==Joint.LEFT_FOOT && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                 System.out.println("Tutor Third Quadrant");
                 gest1 = "Left Hand";
                 gest2 = "Left Foot";
                 adapter.gestTranslator(gest1,gest2, gestState);
                 ashleysIdea = true;
            } 
            else if(left.handCheck().equals("Left") &&  user.getNearestJoint()==Joint.RIGHT_ELBOW && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                 System.out.println("Tutor Fourth Quadrant");
                 gest1 = "Left Hand";
                 gest2 = "Right Elbow";
                 adapter.gestTranslator(gest1,gest2, gestState);
                 ashleysIdea = true;
            } 
            else if(right.handCheck().equals("Right") &&  user.getNearestJoint()==Joint.LEFT_HAND && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                 System.out.println("Student First Quadrant");
                 gest1 = "Right Hand";
                 gest2 = "Left Hand";
                 adapter.gestTranslator(gest1,gest2, gestState);
                 ashleysIdea = true;
            }
            else if(right.handCheck().equals("Right") &&  user.getNearestJoint()==Joint.RIGHT_FOOT && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                 System.out.println("Student Second Quadrant");
                 gest1 = "Right Hand";
                 gest2 = "Right Foot";
                 adapter.gestTranslator(gest1,gest2, gestState);
                 ashleysIdea = true;
               
            }
            else if(right.handCheck().equals("Right") &&  user.getNearestJoint()==Joint.LEFT_FOOT && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                 System.out.println("Student Third Quadrant");
                 gest1 = "Right Hand";
                 gest2 = "Left Foot";
                 adapter.gestTranslator(gest1,gest2, gestState);
                 ashleysIdea = true;
                 
            }
            else if(right.handCheck().equals("Right") &&  user.getNearestJoint()==Joint.LEFT_ELBOW && ashleysIdea ==false) //&&  user.getNearestJoint()==Joint.LEFT_FOOT
            {
                System.out.println("Student Fourth Quadrant");
                gest1 = "Right Hand";
                gest2 = "Left Elbow";
                adapter.gestTranslator(gest1,gest2, gestState);
                ashleysIdea = true;
               
            }
             else if(left.handCheck().equals("Left") && user.getNearestJoint()==Joint.RIGHT_SHOULDER && ashleysIdea ==false)
            {
                System.out.println("Pause Game");
                gest1 = "PauseSequence";
                gest2 = "";
                adapter.gestTranslator(gest1,gest2, gestState);
                ashleysIdea = true;
               
            } else if(right.handCheck().equals("Right") &&user.getNearestJoint()==Joint.LEFT_SHOULDER && ashleysIdea ==false)
            {
                System.out.println("Quit Game");
                gest1 = "QuitSequence";
                gest2 = "";
                adapter.gestTranslator(gest1,gest2, gestState);
                ashleysIdea = true;
               
            }
    
        }
          catch(Exception e)
        {
        }
        
        }
        else if(user.getHighestJoint()== Joint.HEAD)
            {
            ashleysIdea = false;
            System.out.println("gesture lock");
            adapter.gestTranslator(gest1,gest2, gestState);
            
            }
        else
            {
                //System.out.println("milk tea!!!!");
                //ashleysIdea = false;
            }
      
          //clear gesture
          
    }
}