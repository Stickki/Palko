package Task02;

import java.io.*;


 /**
 * The class Resistance test
 */ 
public class ResistanceTest {


/** 
 *
 * Test electric resistance
 *
 */
    public void testElectricResistance() { 


        Resistance resis = new Resistance(3, 6, 9, 3.5);

        assertEquals(24.0, resis.getResistance(), 0.0001);

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(out)) {
            oos.writeObject(resis);
            byte[] bytes = out.toByteArray();
            try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
                    ObjectInputStream ois = new ObjectInputStream(in)) {
                Resistance resis_2 = (Resistance) ois.readObject();
                assertEquals(resis.getResistance(), resis_2.getResistance(), 0.0001);
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }


/** 
 *
 * Assert equals
 *
 * @param d  the d
 * @param resistance  the resistance
 * @param d0  the d0
 */
    private void assertEquals(double d, double resistance, double d0) { 


        throw new UnsupportedOperationException("Не п1дтримується.");
    }

}