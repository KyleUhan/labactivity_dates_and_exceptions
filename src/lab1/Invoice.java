package lab1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kyle Uhan
 */
public class Invoice {

    private int gracePeriod = 15;

    private Calendar invoiceDate;
    private Calendar dueDate;

    private Date date;
    private SimpleDateFormat simpleDateFormat;

    public Invoice() {
        setInvoiceDate(Calendar.getInstance());
    }

    public String getFormattedInvoiceDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm a");
        return dateFormat.format(getInvoiceDate().getTime());
    }

    //May not be the best way, but when I set the Calendar object "dueDate"
    //it was only pointing at the Calendar object "invoice", so when I would add
    //time to just the "dueDate" the original "invoice" was being adjusted as well.
    //This causes a problem as the "invoice" time should not change - only the "dueDate"
    //time 
    //
    public Calendar getAdjustedDueDate() {
        setDueDate((Calendar) getInvoiceDate().clone());
        getDueDate().add(Calendar.DATE, getGracePeriod());
        return getDueDate();
    }

    public String getDueDateAsString() {
        setSimpleDateFormat(new SimpleDateFormat("MM/dd/YYYY"));
        setDueDate((Calendar) getInvoiceDate().clone());
        getDueDate().add(Calendar.DATE, getGracePeriod());
        setDate(getDueDate().getTime());
        return getSimpleDateFormat().format(getDate());
    }

    //Getters and Setters
    private Calendar getInvoiceDate() {
        return invoiceDate;
    }

    private void setInvoiceDate(final Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    private Calendar getDueDate() {
        return dueDate;
    }

    private void setDueDate(final Calendar dueDate) {
        this.dueDate = dueDate;
    }

    private int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(final int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    private SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    private void setSimpleDateFormat(final SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    private Date getDate() {
        return date;
    }

    private void setDate(final Date date) {
        this.date = date;
    }

}
