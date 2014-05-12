/**
 * Write a description of class TableHasTutorState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableHasTutorState implements TableState
{
   private Table table;
   
   public TableHasTutorState(Table table){
      this.table = table;
   }
   
   public void seat(){}
   public void leave(){
      table.setTableState(table.getEmptyTableState());
   }
   public void tutor(){}   
   public void timeOut()
   {
       table.setPreviousState(table.getTableState());
       table.setTableState(table.getTableTimeOutState());
   }
}
