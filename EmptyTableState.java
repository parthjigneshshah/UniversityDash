/**
 * Write a description of class EmptyTableState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmptyTableState implements TableState 
{
   private Table table;
   
   public EmptyTableState(Table table){
      this.table = table;
   }
   
   public void seat(){
      table.setTableState(table.getHasStudentState());
   }
   public void leave(){}
   public void tutor(){}
   public void timeOut(){}
}
