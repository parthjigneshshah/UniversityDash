/**
 * Write a description of class ImageLoader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageLoader  
{
    private static String [] timerImages = {"0.png","1.png","2.png","3.png","4.png","5.png",
                  "6.png","7.png","8.png","9.png","10.png","11.png","12.png","13.png","14.png","15.png",
                "16.png","17.png","18.png","19.png","20.png"};
                  
    public static String getTimerImage(int index){
        return timerImages[index];
    }
}
