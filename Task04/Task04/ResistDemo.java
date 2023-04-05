package Task04;

import java.io.*;


 /**
 * The class Resist demo
 */ 
public class ResistDemo {

/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        Resist r = new Resist(35, 70, 105, 2.5);
        System.out.println("Загальний опiр: " + r.getResistance() + " ohms");
        System.out.println("Шiстнадцяткове представлення: " + r.getHexadecimalRepresentation() + " ohms");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resist.ser"))) {
            out.writeObject(r);
        } catch (IOException e) {
            System.out.println("Помилка серiалiзацiї ElectricResistance: " + e.getMessage());
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("resist.ser"))) {
            Resist r2 = (Resist)in.readObject();
            System.out.println("Десерiалiзований електричний опiр: " + r2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Помилка серiалiзацiї ElectricResistance: " + e.getMessage());
        }
    }
}
   
