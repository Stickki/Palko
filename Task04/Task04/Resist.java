package Task04;


import java.io.Serializable;


 /**
 * The class Resist implements serializable
 */ 
public class Resist implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double volt1;
    private final double volt2;
    private final double volt3;
    private final double current;
    private final double resistance;
    

/** 
 *
 * Resist
 *
 * @param v1  the v1. 
 * @param v2  the v2. 
 * @param v3  the v3. 
 * @param i  the i. 
 * @return public
 */
    public Resist(double v1, double v2, double v3, double i) { 

        volt1 = v1;
        volt2 = v2;
        volt3 = v3;
        current = i;
        resistance = (volt1 + volt2 + volt3) / current;
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


        double totalVoltage = volt1 + volt2 + volt3;
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