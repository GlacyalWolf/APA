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
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private Context context;

    private static Repository repo;
    private static ArrayList<usuario> ulist;
    public static final String FILE_NAME = "/listausuarios";

    public Repository() {
        this.context = context;
    }

    public static Repository get(Context context){
        if(repo == null){
            repo = new Repository();
        }
        return repo;
    }

    //Metods to acces document
    public static void addUser(String name, String pwd, String mail, Context c){
        File fichero= new File(c.getApplicationContext().getFilesDir().getPath()+FILE_NAME);
        usuario usr = new usuario(name,pwd,mail);

        try {
            if(!fichero.exists()) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(usr);
                oos.flush();
                oos.close();
            }
            else{
                ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(fichero));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    }



