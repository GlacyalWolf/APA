package com.example.apa.Model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hora implements Serializable {
    Date entrada;
    Date salida;

    public hora(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }
}
