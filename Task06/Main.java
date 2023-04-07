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
        double[] allValues = new double[0]; // Create an array to store all values displayed
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
            allValues = concatenateArrays(allValues, values); // Concatenate new values with previous values
            String[] columnNames = { "8 year resistance", "16 year resistance" };
            resultTable.display(values, columnNames, "Electric resistance");

            // Calculate statistics


            System.out.println("\nType 'exit' to exit the program, or any other character to continue:");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                exit = true;
                double minimum = Statistics.findMinimum(allValues);
                double maximum = Statistics.findMaximum(allValues);
                double average = Statistics.calculateAverage(allValues);
                double criterion = 500.0;
                double[] filteredValues = Statistics.filterByCriterion(allValues, criterion);
    
                // Display statistics
                System.out.println("\nStatistics:");
                System.out.printf("Minimum: %.2f\n", minimum);
                System.out.printf("Maximum: %.2f\n", maximum);
                System.out.printf("Average: %.2f\n", average);
                System.out.printf("", criterion);
                for (double value : filteredValues) {
                    System.out.printf("%.2f ", value);
                }
            }
        }
        scanner.close();
    }

    /**
     * Concatenate two arrays.
     * 
     * @param a the first array.
     * @param b the second array.
     * @return the concatenated array.
     */
    public static double[] concatenateArrays(double[] a, double[] b) {
        int length = a.length + b.length;
        double[] result = new double[length];
        int pos = 0;
        for (double value : a) {
            result[pos++] = value;
        }
        for (double value : b) {
            result[pos++] = value;
        }
        return result;
    }
}
