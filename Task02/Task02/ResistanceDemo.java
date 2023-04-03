package Task02;

import java.io.*;

/**
 * The class Resistance demo
 */
public class ResistanceDemo {

    /**
     *
     * Main
     *
     * @param args the args
     */
    public static void main(String[] args) {

        Resistance resis = new Resistance(3, 6, 9, 3.5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resistance.ser"))) {
            out.writeObject(resis);
        } catch (IOException e) {
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("resistance.ser"))) {
            Resistance resis_2 = (Resistance) in.readObject();
            System.out.println(resis_2);
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}