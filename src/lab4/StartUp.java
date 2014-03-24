package lab4;

/**
 *
 * @author Kyle
 */
public class StartUp {

    public static void main(String[] args) {

        DateService ds = new DateService();

        String date = "03/15/2014";

        try {
            ds.convertStringToDate(date);
        } catch (NullPointerException | EmptyException np) {
            System.out.println(np.getLocalizedMessage());
        }

        date = "March 15, 2014 2:30 PM";
        
        try {
            ds.convertStringToCalendar(date);
         } catch (NullPointerException | EmptyException np) {
            System.out.println(np.getLocalizedMessage());
        }
    }
}