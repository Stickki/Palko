public class ElectricResistanceTest {


    /** 
     *
     * Main
     *
     * @param args  the args. 
     */
        public static void main(String[] args) { 
    
            testElectricResistance();
        }
    
    
    /** 
     *
     * Test electric resistance
     *
     */
        private static void testElectricResistance() { 
    
            double[] resistances = { 100.0, 200.0, 300.0 };
            ElectricResistanceFactory factory = new ResultTableFactory();
            ElectricResistance electricResistance = factory.createElectricResistance(resistances);
    
            double resistance8 = 50.0;
            double resistance16 = 75.0;
    
            double expected8YearResistance = 133.3333;
            double expected16YearResistance = 222.2222;
    
            double actual8YearResistance = electricResistance.get8YearResistance(resistance8, 1.0);
            double actual16YearResistance = electricResistance.get16YearResistance(resistance16, 1.0);
    
            if (Math.abs(actual8YearResistance - expected8YearResistance) < 1000) {
                System.out.println("Test for 8 year resistance passed");
            } else {
                System.out.println("Test for 8 year resistance failed");
            }
    
            if (Math.abs(actual16YearResistance - expected16YearResistance) < 1000) {
                System.out.println("Test for 16 year resistance passed");
            } else {
                System.out.println("Test for 16 year resistance failed");
            }
        }
    }
    
    