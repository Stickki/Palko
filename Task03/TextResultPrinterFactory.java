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