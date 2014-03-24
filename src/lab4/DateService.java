package lab4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kyle
 */
public class DateService {

    public void convertStringToDate(final String dateString) throws NullPointerException, EmptyException{
        if(dateString == null){
            throw new NullPointerException("String date not be null");
        }
        if(dateString.isEmpty()){
            throw new EmptyException("String date must not be empty");
        }
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        try {
            Date date = df.parse(dateString);
            System.out.println(df.format(date) + "\t\t - Converted to Date Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format -- required: #/##/####");
        }

    }

    public final void convertStringToCalendar(final String dateString) throws NullPointerException, EmptyException{
        if(dateString == null || dateString.isEmpty()){
            throw new RuntimeException("String date not be null");
        }
        if(dateString.isEmpty()){
            throw new EmptyException("String date must not be empty");
        }
        
        Calendar calendar = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("MMM dd, yyyy H:mm a");
       
        try {
            calendar.setTime(df.parse(dateString));
            Date d = calendar.getTime();
            System.out.println(df.format(d) + "\t - Converted to Calendar Object");
        } catch (ParseException pe) {
            System.out.println("Illegal format -- required: \tMonth day, year time am/pm\n"
                    + "\t\t\t\tEample: March 15, 2014 2:30 PM");
        }
    }

}
