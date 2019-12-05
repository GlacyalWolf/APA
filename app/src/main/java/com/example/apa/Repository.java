package com.example.apa;

import android.content.Context;

public class Repository {
    private Context context;
    private static Repository repo;

    public Repository() {
        this.context = context;
    }

    public static Repository get(){
        if(repo == null){
            repo = new Repository();
        }
        return repo;
    }
    //Metods to acces document

}
