public class BasicResultTable implements ResultTable {
    @Override

/** 
 *
 * Display
 *
 * @param values  the values. 
 * @param columnNames  the column names. 
 * @param tableName  the table name. 
 */
    public void display(double[] values, String[] columnNames, String tableName) { 

    System.out.println("Table: " + tableName);
    System.out.print("| ");
    for (String columnName : columnNames) {
    System.out.print(columnName + " | ");
    }
    System.out.println();
    for (double value : values) {
    System.out.print("| ");
    System.out.printf("%-10.2f |", value);
    System.out.println();
    }
    }
    }
