package com.example.apa.Model;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Fichaje implements Serializable {
    private String entrada;
    private String salida;

    public Fichaje() {
        Date date= new Date();
        DateFormat entrada= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());
        DateFormat salida= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault());

        this.entrada = entrada.format(date);
        this.salida = salida.format(date);
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }


}
