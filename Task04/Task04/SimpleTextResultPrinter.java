package Task04;



 /**
 * The class Simple text result printer implements result printer
 */ 
public class SimpleTextResultPrinter implements ResultPrinter {

/** 
 *
 * Print
 *
 * @param result  the result. 
 */
    public void print(ResistanceResult result) { 

        System.out.println("Результати розрахунку опору:");
        System.out.printf("Загальний опiр: %.2f ohms\n", result.getTotalResistance());
        System.out.printf("Опiр провiдника 1: %.2f ohms\n", result.getResistance1());
        System.out.printf("Опiр провiдника 2: %.2f ohms\n", result.getResistance2());
        System.out.printf("Опiр провiдника 3: %.2f ohms\n", result.getResistance3());
    }
}



