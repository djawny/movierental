package zad2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.Map;

public class HolidaysCalendar {
    private int status;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Map<Date,Holiday> holidays;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<Date, Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<Date, Holiday> holidays) {
        this.holidays = holidays;
    }
}
