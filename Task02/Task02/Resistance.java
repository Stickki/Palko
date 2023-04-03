package Task02;

import java.io.Serializable;


 /**
 * The class Resistance implements serializable
 */ 
public class Resistance implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double voltage1;
    private final double voltage2;
    private final double voltage3;
    private final double current;
    private final double resistance;


/** 
 *
 * Resistance
 *
 * @param v1  the v1
 * @param v2  the v2
 * @param v3  the v3
 * @param i  the i
 * @return public
 */
    public Resistance(double v1, double v2, double v3, double i) { 


        voltage1 = v1;
        voltage2 = v2;
        voltage3 = v3;
        current = i;
        resistance = (voltage1 + voltage2 + voltage3) / current;
    }


/** 
 *
 * Gets the resistance
 *
 * @return the resistance
 */
    public double getResistance() { 


        return resistance;
    }


/** 
 *
 * Calculate total resistance
 *
 * @return double
 */
    public double calculateTotalResistance() { 


        double totalVoltage = voltage1 + voltage2 + voltage3;
        return totalVoltage / current;
    }


/** 
 *
 * Gets the hexadecimal representation
 *
 * @return the hexadecimal representation
 */
    public String getHexadecimalRepresentation() { 


        double resistance = calculateTotalResistance();
        int hexValue = (int) resistance;
        return Integer.toHexString(hexValue);
    }
}