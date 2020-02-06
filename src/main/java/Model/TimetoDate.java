package Model;

import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.TimeZone;

import java.util.Date;

public class TimetoDate {
    private long unixSecondes ;

    public long getUnixSecondes() {
        return unixSecondes;
    }

    public void setUnixSecondes(long unixSecondes) {
        this.unixSecondes = unixSecondes;
    }

    public TimetoDate(long unixSecondes) {
        this.unixSecondes = unixSecondes;
    }
    public Date converttimetodate(){
        Date date = new Date(this.unixSecondes * 1000L);
        return date;
    }
    public String converttimetostr(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String string = simpleDateFormat.format(this.converttimetodate());
        return string;
    }

}
