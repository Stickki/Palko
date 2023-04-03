import java.io.Serializable;

public class Resist implements Serializable {
    private static final long serialVersionUID = 1L;
    private final double volt1;
    private final double volt2;
    private final double volt3;
    private final double current;
    private final double resistance;

    public Resist(double v1, double v2, double v3, double i) {
        volt1 = v1;
        volt2 = v2;
        volt3 = v3;
        current = i;
        resistance = (volt1 + volt2 + volt3) / current;
    }

    public double getResistance() {
        return resistance;
}

    public double calculateTotalResistance() {
        double totalVoltage = volt1 + volt2 + volt3;
        return totalVoltage / current;
    }

    public String getHexadecimalRepresentation() {
        double resistance = calculateTotalResistance();
        int hexValue = (int) resistance;
        return Integer.toHexString(hexValue);
    }
}