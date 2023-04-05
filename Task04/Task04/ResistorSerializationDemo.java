package Task04;

import java.io.*;


 /**
 * The class Resistor serialization demo
 */ 
public class ResistorSerializationDemo {

/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        Resist er = new Resist(35, 70, 105, 2.5);
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resist.ser"))) {
            out.writeObject(er);
        } catch (IOException e) {
        }
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("resist.ser"))) {
            Resist er2 = (Resist)in.readObject();
            System.out.println(er2); // виведе ElectricResistance{voltage1=10.000000, voltage2=20.000000, voltage3=30.000000, current=2.500000, resistance=24.000000}
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}


