package com.example.apa.ViewModel.User;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.apa.Model.Fichaje;
import com.example.apa.Repository;

import java.io.IOException;
import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    public static void addHora(Context c){
        Repository.addHora(c);
    }


}
