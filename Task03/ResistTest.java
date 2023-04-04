import java.io.*;


 /**
 * The class Resist test
 */ 
public class ResistTest {

/** 
 *
 * Test resistance calculation
 *
 */
public void testResistanceCalculation() {  


    Resist r = new Resist(35, 70, 105, 2.5);
    
    assertEquals(40.0, r.getResistance(), 0.0001);
    
    try (ByteArrayOutputStream out = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(out)) {
        oos.writeObject(r);
        byte[] bytes = out.toByteArray();
        try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             ObjectInputStream ois = new ObjectInputStream(in)) {
            Resist r2 = (Resist)ois.readObject();
            assertEquals(r.getResistance(), r2.getResistance(), 0.0001);
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
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


    throw new UnsupportedOperationException("Не пiдтримується!");
}
}