package Task02;

import java.io.*;


 /**
 * The class Main
 */ 
public class Main {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Resistance resis = new Resistance(3, 6, 9, 3.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resistance.ser"))) {
            oos.writeObject(resis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("resistance.ser"))) {
            Resistance resis_2 = (Resistance) ois.readObject();
            System.out.println("8-рiчне уявлення: " + resis_2.getResistance() + " Ом");
            System.out.println("16-рiчне уявлення: " + resis_2.getHexadecimalRepresentation() + " Ом");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
