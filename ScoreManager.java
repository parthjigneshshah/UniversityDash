/**
 * Write a description of class ScoreManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
import java.awt.Color;
import java.awt.Font;

public class ScoreManager implements Observer
{
    public static int totalScore =0;
    Table tableobject;
    private int studentType=0;
    private int timeSaved =0;
    private int baseScore = 50;
    private int capturedScore = 0;    
    
    
    
    
    public ScoreManager()
    {
        
    }
    
public void update(Table table)
{


    TableState tableState = table.getTableState();
    timeSaved = table.getSavedTime();
    
    int finalTime = timeSaved/1000;
    
    
    if(tableState instanceof TableHasStudentState)
    {
       
     
        totalScore = totalScore + baseScore;
        
       
    }
    
    
    
    
    else if(tableState instanceof TableHasTutorState)
    {
       
        studentType = table.getStudent().getStudentType();
        
       
        
        
    
    if(studentType == 0)
    {
       
        totalScore = totalScore + (finalTime)*25;
       

    }
    
    else if(studentType == 1)
    {
       
        totalScore = totalScore + (finalTime)*30;
       
                
    }
    
    else if(studentType == 2)
    {

        totalScore = totalScore + (finalTime)*15;
       
                
    }
    
    else if(studentType == 3)
    {
    
        totalScore = totalScore + (finalTime)*10;
       
                
    }
    
    
}
}


public  int updateScore()
{
    return totalScore;
    
}
}