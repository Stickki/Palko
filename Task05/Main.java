import java.util.Scanner;

/**
 * 
 * The class Main
 */
public class Main {

    /**
     * 
     * Main
     * 
     * @param args the args.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            double[] resistances = new double[3];
            System.out.println("Enter resistance values:");
            for (int i = 0; i < resistances.length; i++) {
                String value = String.format("v%d", i + 1);
                System.out.print(value + ": ");
                resistances[i] = scanner.nextDouble();
            }
            ElectricResistanceFactory factory = new ResultTableFactory();
            ElectricResistance electricResistance = factory.createElectricResistance(resistances);
            ResultTable resultTable = factory.createResultTable("basic");

            System.out.println("Enter values to calculate:");
            System.out.print("8 year: ");
            double resistance8 = scanner.nextDouble();
            System.out.print("16 year: ");
            double resistance16 = scanner.nextDouble();
            double[] values = { electricResistance.get8YearResistance(resistance8, 1.0), electricResistance.get16YearResistance(resistance16, 1.0) };
            String[] columnNames = { "8 year resistance", "16 year resistance" };
            resultTable.display(values, columnNames, "Electric resistance");

            System.out.println("\nType 'exit' to exit the program, or any other character to continue:");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                exit = true;
            }
        }
        scanner.close();
    }
}
