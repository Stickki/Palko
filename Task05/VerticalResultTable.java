public class VerticalResultTable implements ResultTable {
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
    for (int i = 0; i < values.length; i++) {
    System.out.printf("%-20s %-10.2f\n", columnNames[i], values[i]);
    }
    }
    }
