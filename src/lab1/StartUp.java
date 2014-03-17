
package lab1;

import java.text.SimpleDateFormat;

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
        System.out.println("Date plus gracePeriod: " +i.getDueDateAsString(new SimpleDateFormat("MM/dd/yyyy HH:mm a")));
        
    }
    
}
