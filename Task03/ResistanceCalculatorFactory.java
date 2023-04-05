public class ResistanceCalculatorFactory {

    /** 
     *
     * Create resistance calculator
     *
     * @param resistances  the resistances. 
     * @return ResistanceCalculator
     */
        public static ResistanceCalculator createResistanceCalculator(double[] resistances) { 
    
        return new ElectricResistanceCalculator(resistances);
        }
    
    /** 
     *
     * Create resistance calculator display
     *
     * @return ResistanceCalculatorDisplay
     */
        public static ResistanceCalculatorDisplay createResistanceCalculatorDisplay() { 
    
            return new ElectricResistanceCalculatorDisplay();
        }
        }
    