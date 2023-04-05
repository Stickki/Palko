public class ElectricResistanceDemo {


    /** 
     *
     * Main
     *
     * @param args  the args. 
     */
        public static void main(String[] args) { 
    
            double[] resistances = {10, 20, 30};
            ResistanceCalculator calculator = ResistanceCalculatorFactory.createResistanceCalculator(resistances);
            ResistanceCalculatorDisplay display = ResistanceCalculatorFactory.createResistanceCalculatorDisplay();
        
            // use the calculator object to calculate resistance and display results
            double current = 2.5;
            double voltage = 50;
            double resistance8Years = calculator.get8YearResistance(current, voltage);
            display.display8YearResistance(resistance8Years);
            double resistance16Years = calculator.get16YearResistance(current, voltage);
            display.display16YearResistance(resistance16Years);
        }
        
    }
    
    
    

