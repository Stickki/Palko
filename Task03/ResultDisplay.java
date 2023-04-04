class ResultDisplay {

    /**
    * The class Table result display factory implements result display factory
    */ 
       public class TableResultDisplayFactory implements ResultDisplayFactory {
       @Override
   
   /** 
    *
    * Create result display
    *
    * @param result  the result
    * @return ResultDisplay
    */
       public ResultDisplay createResultDisplay(ResistanceResult result) { 
   
           return new TableResultDisplay(result);
       }
       @Override
   
   /** 
    *
    * Gets the display name
    *
    * @return the display name
    */
       public String getDisplayName() { 
   
           return "Таблична дiаграма";
       }
   }
   
   public class ChartResultDisplayFactory implements ResultDisplayFactory {
       @Override
   
   /** 
    *
    * Create result display
    *
    * @param result  the result
    * @return ResultDisplay
    */
       public ResultDisplay createResultDisplay(ResistanceResult result) { 
   
           return new ChartResultDisplay(result);
       }
       @Override
   
   /** 
    *
    * Gets the display name
    *
    * @return the display name
    */
       public String getDisplayName() { 
   
           return "Вiдображення дiаграми";
       }
   }
   
       
   }
   