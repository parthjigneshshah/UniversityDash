import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftHandState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftHandState extends Actor
{
    int framesNearTarget = 0;
    String highJoint="f";
    UserData user;

    public LeftHandState(UserData user)
    {
        this.user = user;
    }
    
    public void act()
    {
     //   handCheck();
    }
    
   public String handCheck()
    {
         if (user.getHighestJoint()==Joint.LEFT_HAND )
            {
                highJoint="Left";
                return highJoint;
            } 
        return "boooooom";
    }
}

