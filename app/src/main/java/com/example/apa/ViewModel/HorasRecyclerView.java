package com.example.apa.ViewModel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apa.Model.Fichaje;
import com.example.apa.Model.usuario;
import com.example.apa.R;

import java.util.ArrayList;

public class HorasRecyclerView extends RecyclerView.Adapter<HorasRecyclerView.AdapterHoras> {
    static ArrayList<Fichaje> fechaList;
    static NavController nv;
    public static class AdapterHoras extends RecyclerView.ViewHolder {
        TextView entrada, salida;

        public AdapterHoras(final View historial_horas_card) {
            super(historial_horas_card);
            entrada = historial_horas_card.findViewById(R.id.entrada);
            salida = historial_horas_card.findViewById(R.id.salida);
        }
    }
    @NonNull
    @Override
    public AdapterHoras onCreateViewHolder( ViewGroup viewGoup, int x) {
        View v = LayoutInflater.from(viewGoup.getContext()).inflate(R.layout.historial_horas_card,viewGoup,false);
        AdapterHoras ah = new AdapterHoras(v);
        return ah;

    }

    @Override
    public void onBindViewHolder(AdapterHoras holder, int i) {
        holder.entrada.setText(fechaList.get(i).getEntrada());
        holder.salida.setText(fechaList.get(i).getSalida());

    }

    @Override
    public int getItemCount() {
        return fechaList.size();
    }



}
