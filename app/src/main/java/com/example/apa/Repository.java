package com.example.apa;

import android.content.Context;
import android.media.JetPlayer;

import com.example.apa.Model.usuario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

public class Repository {
    private Context context;

    private static Repository repo;
    private static List<usuario> ulist;
    public static final String FILE_NAME = "listausuarios";

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
    public static void addUser(String name, String pwd, String mail, Context c){


        usuario usr;

        usr = new usuario(name,pwd,mail);
        try {
            FileOutputStream fos = c.openFileOutput(FILE_NAME, Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(usr);
            os.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    }



