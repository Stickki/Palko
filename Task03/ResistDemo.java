import java.io.*;


 /**
 * The class Resist demo
 */ 
public class ResistDemo {

/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) {  


        Resist r = new Resist(35, 70, 105, 2.5);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("resist.ser"))) {
            out.writeObject(r);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("resist.ser"))) {
            Resist r2 = (Resist)in.readObject();
            System.out.println(r2); 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }