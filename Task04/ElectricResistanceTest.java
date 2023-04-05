import java.io.*;



 /**
 * The class Electric resistance test
 */ 
public class ElectricResistanceTest {

    private static final double DELTA = 1e-9;


/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        testResistanceCalculation();
        testSerialization();
    }


/** 
 *
 * Test resistance calculation
 *
 */
    private static void testResistanceCalculation() { 

        double[] resistances = {10, 20, 30};
        ElectricResistance calculator = new ElectricResistance(resistances);

        double current = 2.5;
        double voltage = 50;

        double expected8YearResistance = 60;
        double expected16YearResistance = 66.6;

        double actual8YearResistance = calculator.get8YearResistance(current, voltage);
        double actual16YearResistance = calculator.get16YearResistance(current, voltage);

        if (Math.abs(expected8YearResistance - actual8YearResistance) > DELTA) {
            System.out.println("get8YearResistance test failed!");
            System.out.println("Expected: " + expected8YearResistance + ", Actual: " + actual8YearResistance);
        }

        if (Math.abs(expected16YearResistance - actual16YearResistance) > DELTA) {
            System.out.println("get16YearResistance test failed!");
            System.out.println("Expected: " + expected16YearResistance + ", Actual: " + actual16YearResistance);
        }
    }


/** 
 *
 * Test serialization
 *
 */
    private static void testSerialization() { 

        double[] resistances = {10, 20, 30};
        ElectricResistance calculator = new ElectricResistance(resistances);

        // serialize the object
        ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteArrayOut);
            out.writeObject(calculator);
            out.close();
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
            return;
        }

        // deserialize the object
        ByteArrayInputStream byteArrayIn = new ByteArrayInputStream(byteArrayOut.toByteArray());
        try {
            ObjectInputStream in = new ObjectInputStream(byteArrayIn);
            ElectricResistance deserializedCalculator = (ElectricResistance) in.readObject();
            in.close();

            double current = 2.5;
            double voltage = 50;

            double expected8YearResistance = 60;
            double expected16YearResistance = 66.6;

            double actual8YearResistance = deserializedCalculator.get8YearResistance(current, voltage);
            double actual16YearResistance = deserializedCalculator.get16YearResistance(current, voltage);

            if (Math.abs(expected8YearResistance - actual8YearResistance) > DELTA) {
                System.out.println("Deserialized get8YearResistance test failed!");
                System.out.println("Expected: " + expected8YearResistance + ", Actual: " + actual8YearResistance);
            }

            if (Math.abs(expected16YearResistance - actual16YearResistance) > DELTA) {
                System.out.println("Deserialized get16YearResistance test failed!");
                System.out.println("Expected: " + expected16YearResistance + ", Actual: " + actual16YearResistance);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }
    }
}
