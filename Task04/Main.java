import java.util.Scanner;


 /**
 * The class Main
 */ 
public class Main {

/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);
        double[] resistances = new double[3];
        System.out.println("Введите значения сопротивлений:");
        for (int i = 0; i < resistances.length; i++) {
            resistances[i] = scanner.nextDouble();
        }
        
        ElectricResistanceFactory factory = new ResultTableFactory();
        ElectricResistance electricResistance = factory.createElectricResistance(resistances);
        ResultTable resultTable = factory.createResultTable("basic");
        
        System.out.println("Введите значения для расчета:");
        System.out.print("8 лет: ");
        double resistance8 = scanner.nextDouble();
        System.out.print("16 лет: ");
        double resistance16 = scanner.nextDouble();
        double[] values = { electricResistance.get8YearResistance(resistance8, 1.0),
                            electricResistance.get16YearResistance(resistance16, 1.0) };
        String[] columnNames = { "8 year resistance", "16 year resistance" };
        resultTable.display(values, columnNames, "Electric resistance");
        scanner.close();
    }
}





