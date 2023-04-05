package Task04;



 /**
 * The class Html table resistance extends resistance
 */ 
public class HtmlTableResistance extends Resistance {


/** 
 *
 * Html table resistance
 *
 * @param resistances  the resistances. 
 * @return public
 */
    public HtmlTableResistance(double[] resistances) { 

    }


/** 
 *
 * Print table
 *
 * @param columnWidth  the column width. 
 * @param cssClass  the css class. 
 */
    public void printTable(int columnWidth, String cssClass) { 

        double totalResistance = getTotalResistance();
        
        System.out.println("<table class=\"" + cssClass + "\">");
        System.out.println("<tr><th>Опiр</th><th>Вольтаж</th></tr>");
        int n = 0;

        for (int i = 0; i < n; i++) {
         
        System.out.println("<tr><td colspan=\"2\">Загальний опiр: " + String.format("%.2f", totalResistance)
                + "</td></tr>");

        System.out.println("</table>");
    }
   
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

}


