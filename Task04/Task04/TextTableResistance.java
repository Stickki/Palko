package Task04;


 /**
 * The class Text table resistance extends resistance
 */ 
public class TextTableResistance extends Resistance {


/** 
 *
 * Text table resistance
 *
 * @param resistances  the resistances. 
 * @return public
 */
    public TextTableResistance(double[] resistances) { 

    }


/** 
 *
 * Print table
 *
 * @param columnWidth  the column width. 
 * @param separator  the separator. 
 */
    public void printTable(int columnWidth, String separator) { 

        double totalResistance = getTotalResistance();
        double[] resistances = getResistances();
        int n = resistances.length;

        System.out.println("|" + String.format("%-" + columnWidth + "s", "Опiр") + separator
                + String.format("%-" + columnWidth + "s", "Вольтаж") + "|");

        for (int i = 0; i < columnWidth * 2 + separator.length() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("|" + String.format("%-" + columnWidth + ".2f", resistances[i]) + separator
                    + String.format("%-" + columnWidth + ".2f", resistances[i] * getCurrent()) + "|");
        }

        // Виводимо результуючий загальний опір
        System.out.println("Total resistance: " + String.format("%.2f", totalResistance));
    }


/** 
 *
 * Gets the total resistance
 *
 * @return the total resistance
 */
    private double getTotalResistance() { 

        throw new UnsupportedOperationException("Не пiдтримується!");
    }


/** 
 *
 * Gets the resistances
 *
 * @return the resistances
 */
    private double[] getResistances() { 

        throw new UnsupportedOperationException("Не пiдтримується!");
    }


/** 
 *
 * Gets the current
 *
 * @return the current
 */
    private double getCurrent() { 

        throw new UnsupportedOperationException("Не пiдтримується!");
    }

    void printTable(int i) {
        throw new UnsupportedOperationException("Не пiдтримується!");
    }
}

