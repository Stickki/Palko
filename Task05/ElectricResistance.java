import java.io.Serializable;


 /**
 * The class Electric resistance implements serializable
 */ 
public class ElectricResistance implements Serializable {

    private double[] resistances;
    private double totalResistance;


/** 
 *
 * Electric resistance
 *
 * @param resistances  the resistances. 
 * @return public
 */
    public ElectricResistance(double[] resistances) { 

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


/** 
 *
 * Get8 year resistance
 *
 * @param current  the current. 
 * @param voltage  the voltage. 
 * @return the 8 year resistance
 */
    public double get8YearResistance(double current, double voltage) { 

        return totalResistance * voltage / current;
    }


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
        return resistance16Years * voltage / current;
    }
}
