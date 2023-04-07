public class ElectricResistanceCalculatorDisplay implements ResistanceCalculatorDisplay {
    @Override

/** 
 *
 * Display8 year resistance
 *
 * @param resistance  the resistance. 
 */
    public void display8YearResistance(double resistance) { 

        System.out.println("8-year resistance: " + resistance);
    }

    @Override

/** 
 *
 * Display16 year resistance
 *
 * @param resistance  the resistance. 
 */
    public void display16YearResistance(double resistance) { 

        System.out.println("16-year resistance: " + resistance);
    }

}

