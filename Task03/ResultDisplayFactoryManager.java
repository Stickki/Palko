public class ResultDisplayFactoryManager {
    private final ArrayList<ResultDisplayFactory> factories = new ArrayList<>();


/** 
 *
 * It is a constructor. 
 *
 */
    public ResultDisplayFactoryManager() { 

        factories.add(new TableResultDisplayFactory());
        factories.add(new ChartResultDisplayFactory());
    }


/** 
 *
 * Gets the factories
 *
 * @return the factories
 */
    public ArrayList<ResultDisplayFactory> getFactories() { 

        return factories;
    }
}

