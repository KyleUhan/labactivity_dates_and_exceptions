package lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kyle Uhan
 */
public class Invoice {

    private Calendar invoiceDate;
    private Calendar dueDate;
    private final int gracePeriod = 15;
    private SimpleDateFormat sdf;
    private Date date;

    public Invoice() {
        setInvoiceDate(Calendar.getInstance());
    }

    public String getFormattedInvoiceDate() {
        setSdf(new SimpleDateFormat("MM/dd/YY"));
        setDate(getInvoiceDate().getTime());
        return getSdf().format(getDate());
    }

    public Calendar getAdjustedDueDate() {
        //setInvoiceDate(Calendar.getInstance());
        setDueDate(getInvoiceDate());
        
        getDueDate().add(Calendar.DATE, getGracePeriod());
        
        return getDueDate();
    }

    public String getDueDateAsString() {
        //setInvoiceDate(Calendar.getInstance());
        setDueDate(getInvoiceDate());
        
        setSdf(new SimpleDateFormat("MM/dd/YYYY"));
        
        getDueDate().add(Calendar.DATE, getGracePeriod());
        
        setDate(getDueDate().getTime());

        return getSdf().format(getDate());
    }

    //Getters and Setters
    private void setDueDate(final Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Calendar getDueDate() {
        return dueDate;
    }
    
    

    private SimpleDateFormat getSdf() {
        return sdf;
    }

    private void setSdf(final SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    private Date getDate() {
        return date;
    }

    private void setDate(final Date date) {
        this.date = date;
    }

    private void setInvoiceDate(final Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    private int getGracePeriod() {
        return gracePeriod;
    }

    private Calendar getInvoiceDate() {
        return invoiceDate;
    }
    
    

}
