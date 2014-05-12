/**
 * Write a description of class TimeOutState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableTimeOutState implements TableState
{
   private Table table;
   
   public TableTimeOutState(Table table){
      this.table = table;
   }
   
   public void seat(){}
   
   public void leave(){
      table.setTableState(table.getEmptyTableState());
   }
   
   public void tutor(){
      table.setTableState(table.getHasTutorState());
   }
   
   public void timeOut()
   {
    
   }
}
