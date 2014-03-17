package lab2;

/**
 *
 * @author Kyle
 */
public class StartUp {

    public static void main(String[] args) {

        DateService ds = new DateService();

        String date = "03/15/2014";

        ds.convertStringToDate(date);

        date = "March 15, 2014 2:30 PM";

        ds.convertStringToCalendar(date);
    }

}
