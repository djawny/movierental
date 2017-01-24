package zad2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class HolidaysCalendar {
    private int status;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Map<Date,List<Holiday>> holidays;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Map<Date, List<Holiday>> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<Date, List<Holiday>> holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return "HolidaysCalendar{" +
                "status=" + status +
                ", holidays=" + holidays +
                '}';
    }
}
