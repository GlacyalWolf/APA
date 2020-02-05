package com.example.apa.ViewModel.User;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.apa.Repository;

import java.io.IOException;

public class LoginViewModel extends ViewModel {
    public static boolean login_function(String user, String pws, Context c) throws IOException, ClassNotFoundException {
        return Repository.checkUser(user,pws,c);
    }
}
