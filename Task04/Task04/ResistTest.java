package Task04;

import java.io.*;


 /**
 * The class Resist test
 */ 
public class ResistTest {
    

/** 
 *
 * Test electric resistance
 *
 */
    public void testElectricResistance() { 

        Resist er = new Resist(10, 20, 30, 2.5);
        
        assertEquals(24.0, er.getResistance(), 0.0001);
        
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(out)) {
            oos.writeObject(er);
            byte[] bytes = out.toByteArray();
            try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
                 ObjectInputStream ois = new ObjectInputStream(in)) {
                Resist er2 = (Resist)ois.readObject();
                assertEquals(er.getResistance(), er2.getResistance(), 0.0001);
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }


/** 
 *
 * Assert equals
 *
 * @param d  the d. 
 * @param resistance  the resistance. 
 * @param d0  the d0. 
 */
    private void assertEquals(double d, double resistance, double d0) { 

        throw new UnsupportedOperationException("Не пiдтримується!");
    }

}
