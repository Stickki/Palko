import java.io.*;


 /**
 * The class Resistor serialization demo
 */ 
public class ResistorSerializationDemo {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) {  


        Resist r = new Resist(35, 70, 105, 2.5);
    
        try (FileOutputStream fos = new FileOutputStream("resist.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        try (FileInputStream fis = new FileInputStream("resist.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Resist r2 = (Resist) ois.readObject();
            System.out.println("Опiр: " + r2.getResistance() + " Oм");
            System.out.println("16-рiчна: " + r2.getHexadecimalRepresentation() + " Oм");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }