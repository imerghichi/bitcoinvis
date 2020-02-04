package JSONUtilities;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public Date convert(String date) throws IOException, ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return date1;
    }

    public DateUtil() {
    }

    public static void main(String[] args) throws IOException, ParseException {

        DateUtil dateUtil = new DateUtil();
        String string = "2020-01-23";
        Date date = dateUtil.convert(string);
        System.out.println(date);


    }
}
