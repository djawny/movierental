package zad2;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Holiday {
    private String name;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date date;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date observed;
    private Boolean public;

}
