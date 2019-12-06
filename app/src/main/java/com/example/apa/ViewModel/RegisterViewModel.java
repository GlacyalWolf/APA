package com.example.apa.ViewModel;

import android.content.Context;
import android.widget.EditText;

import androidx.lifecycle.ViewModel;

import com.example.apa.Repository;

public class RegisterViewModel extends ViewModel {
    //Metod to print the register credentials in a document
    public static void register_user(String user, String pasword, String mail, Context c){
        Repository.addUser(user,pasword,mail,c);
    }
}

