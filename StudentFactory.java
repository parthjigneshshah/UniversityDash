/**
 * Write a description of class StudentFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import greenfoot.*;

public class StudentFactory  
{
   private static StudentFactory _instance;
   private Random random;
   
   private StudentFactory(){
       random = new Random();
   }
   
   public synchronized static StudentFactory getInstance(){
       if (_instance == null){
          _instance = new StudentFactory();
       }
       return _instance;
   }
    
   public Student createStudent(){
       //create different type of students
   
       int next = random.nextInt(4);
       Student student = null;
       switch (next){
          case 0: student = new StudentA(next);
            break;
          case 1: student = new StudentB(next);
            break;
          case 2: student = new StudentC(next);
            break;
          case 3: student = new StudentD(next);
            break;
       }
       return student;
   }
}
