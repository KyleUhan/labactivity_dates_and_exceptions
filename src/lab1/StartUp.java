
package lab1;

/**
 *
 * @author Kyle Uhan
 */
public class StartUp {

    public static void main(String[] args) {
        Invoice i = new Invoice();
        System.out.println("Invoice date: " + i.getFormattedInvoiceDate());
        System.out.println("Date plus gracePeriod: "+i.getAdjustedDueDate().getTime());
        System.out.println("Date plus gracePeriod: "+i.getDueDateAsString());
        
    }
    
}
