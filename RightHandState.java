import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightHandState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightHandState extends Actor
{
    /**
     * Act - do whatever the RightHandState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int framesNearTarget = 0;
    String highJoint="f";
    UserData user;
 
     public RightHandState(UserData user)
    {
        this.user = user;
    }
    
    public void act()
    {
      // handCheck();
    }
    
    public String handCheck()
    {
        
       
               if (user.getHighestJoint()==Joint.RIGHT_HAND )
                { 
                      highJoint="Right";
                    return highJoint;
                } 
        
        return "booooom";
        
        }
        
    }
            
        
       


