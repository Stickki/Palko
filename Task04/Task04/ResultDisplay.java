package Task04;


class ResultDisplay {

 /**
 * The class Table result display factory implements result display factory
 */ 
    public class TableResultDisplayFactory implements ResultDisplayFactory {


/** 
 *
 * Create result display
 *
 * @param result  the result. 
 * @return ResultDisplay
 */
    public ResultDisplay createResultDisplay(ResistanceResult result) { 

        return new TableResultDisplay(result);
    }


/** 
 *
 * Gets the display name
 *
 * @return the display name
 */
    public String getDisplayName() { 

        return "Таблична діаграма";
    }
}

public class ChartResultDisplayFactory implements ResultDisplayFactory {

/** 
 *
 * Create result display
 *
 * @param result  the result. 
 * @return ResultDisplay
 */
    public ResultDisplay createResultDisplay(ResistanceResult result) { 

        return new ChartResultDisplay(result);
    }


/** 
 *
 * Gets the display name
 *
 * @return the display name
 */
    public String getDisplayName() { 

        return "Відображення діаграми";
    }
}

    
}
