package com.example.apa.ViewModel.Admin;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apa.Model.usuario;

import java.util.ArrayList;

public class AdminHomeViewModel extends ViewModel {
    static ArrayList<usuario> lista_usr;
    static Context c;

    public static class AdaperUsers extends RecyclerView.ViewHolder{

        public AdaperUsers(@NonNull View itemView) {
            super(itemView);
        }
    }
}
