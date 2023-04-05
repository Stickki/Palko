package Task04;



 /**
 * The class Resistance series result
 */ 
public class ResistanceSeriesResult {
    private final Resistance resistance1;
    private final Resistance resistance2;
    private final double totalResistance;


/** 
 *
 * It is a constructor. 
 *
 * @param resistance1  the resistance1. 
 * @param resistance2  the resistance2. 
 */
    public ResistanceSeriesResult(Resistance resistance1, Resistance resistance2) { 

        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.totalResistance = resistance1.getResistance() + resistance2.getResistance();
    }

    ResistanceSeriesResult(double[] seriesResistance) {
        throw new UnsupportedOperationException("Не пiдтримується!");
    }


/** 
 *
 * Print table
 *
 * @param columnWidth  the column width. 
 */
    public void printTable(int columnWidth) { 

        String format = "| %" + columnWidth + "s | %" + columnWidth + "s | %" + columnWidth + "s |%n";
        String separator = "+";
        for (int i = 0; i < columnWidth + 2; i++) {
            separator += "-";
        }
        separator += "+";

        System.out.format(separator + "%n");
        System.out.format(format, "Опiр 1", "Опiр 2", "Загальний Опiр");
        System.out.format(separator + "%n");
        System.out.format(format, formatResistance(resistance1.getResistance()), formatResistance(resistance2.getResistance()), formatResistance(totalResistance));
        System.out.format(separator + "%n");
    }


/** 
 *
 * Format resistance
 *
 * @param resistance  the resistance. 
 * @return String
 */
    private String formatResistance(double resistance) { 

        return String.format("%.2f", resistance);
    }

    String getResult() {
        throw new UnsupportedOperationException("Не пiдтримується!"); 
        }
}
