package com.example.apa.Model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Out implements Serializable {
    private String day;
    private String hour;

    public Out() {
        Date date= new Date();
        DateFormat h= new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        DateFormat d= new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        this.day = d.format(date);
        this.hour = h.format(date);
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }
}
