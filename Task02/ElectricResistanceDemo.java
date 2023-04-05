import java.io.*;


 /**
 * The class Electric resistance demo
 */ 
public class ElectricResistanceDemo {


/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        double[] resistances = {10, 20, 30};
        ElectricResistance calculator = new ElectricResistance(resistances);

        // serialize the object
        try {
            FileOutputStream fileOut = new FileOutputStream("electricResistance.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(calculator);
            out.close();
            fileOut.close();
            System.out.println("Object saved to electricResistance.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize the object
        ElectricResistance deserializedCalculator = null;
        try {
            FileInputStream fileIn = new FileInputStream("electricResistance.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedCalculator = (ElectricResistance) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized from electricResistance.ser");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // use the deserialized object to calculate resistance
        if (deserializedCalculator != null) {
            double current = 2.5;
            double voltage = 50;
            System.out.println("8-year resistance: " + deserializedCalculator.get8YearResistance(current, voltage));
            System.out.println("16-year resistance: " + deserializedCalculator.get16YearResistance(current, voltage));
        }
    }
}
