/**
 * Write a description of class TableHasStudentState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TableHasStudentState implements TableState
{
    private Table table;
   
   public TableHasStudentState(Table table){
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
       table.setPreviousState(table.getTableState());
       table.setTableState(table.getTableTimeOutState());
   }
}
