public class ResultTableFactory implements ElectricResistanceFactory {


    /** 
     *
     * Create electric resistance
     *
     * @param resistances  the resistances. 
     * @return ElectricResistance
     */
        public ElectricResistance createElectricResistance(double[] resistances) { 
    
        return new ElectricResistance(resistances);
        }
    
    /** 
     *
     * Create result table
     *
     * @param tableType  the table type. 
     * @return ResultTable
     */
        public ResultTable createResultTable(String tableType) { 
    
            if (tableType.equalsIgnoreCase("basic")) {
                return new BasicResultTable();
            } else if (tableType.equalsIgnoreCase("vertical")) {
                return new VerticalResultTable();
            } else {
                throw new IllegalArgumentException("Unsupported table type: " + tableType);
            }
        }
        
    }
    
    
    