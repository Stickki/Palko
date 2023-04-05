package Task04;


 /**
 * The class Text result printer factory implements result printer factory
 */ 
public class TextResultPrinterFactory implements ResultPrinterFactory {

/** 
 *
 * Create simple text printer
 *
 * @return ResultPrinter
 */
    public ResultPrinter createSimpleTextPrinter() { 

        return new SimpleTextResultPrinter();
    }
}
