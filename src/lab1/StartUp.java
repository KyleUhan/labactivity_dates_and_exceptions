
package lab1;

/**
 *
 * @author Kyle Uhan
 */
public class StartUp {

    public static void main(String[] args) {
        Invoice i = new Invoice();
        System.out.println("Current Date: " + i.getFormattedInvoiceDate());
        System.out.println("Date plus gracePeriod: "+i.getDueDate());
        System.out.println("Date plus gracePeriod: "+i.getDueDateAsString());
    }
    
}
