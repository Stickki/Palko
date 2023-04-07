public class ElectricResistanceCalculator implements ResistanceCalculator {
    private double[] resistances;
private double totalResistance;


/** 
 *
 * Electric resistance calculator
 *
 * @param resistances  the resistances. 
 * @return public
 */
public ElectricResistanceCalculator(double[] resistances) { 

    this.resistances = resistances;
    calculateTotalResistance();
}


/** 
 *
 * Calculate total resistance
 *
 */
private void calculateTotalResistance() { 

    double sum = 0;
    for (double resistance : resistances) {
        sum += resistance;
    }
    totalResistance = sum;
}

@Override

/** 
 *
 * Get8 year resistance
 *
 * @param current  the current. 
 * @param voltage  the voltage. 
 * @return the 8 year resistance
 */
public double get8YearResistance(double current, double voltage) { 

    double resistance = totalResistance * voltage / current;
    return resistance;
}

@Override

/** 
 *
 * Get16 year resistance
 *
 * @param current  the current. 
 * @param voltage  the voltage. 
 * @return the 16 year resistance
 */
public double get16YearResistance(double current, double voltage) { 

    double temperatureCoefficient = 0.004; // assuming alpha = 0.004
    double resistanceTemperatureCoefficient = temperatureCoefficient * totalResistance;
    double resistance16Years = totalResistance + resistanceTemperatureCoefficient * 8;
    double resistance = resistance16Years * voltage / current;
    return resistance;
}

}
