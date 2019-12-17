package com.example.apa;

import android.content.Context;
import android.media.JetPlayer;

import com.example.apa.Model.Fichaje;
import com.example.apa.Model.usuario;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private Context context;

    private static Repository repo;

    public static final String FILE_NAME = "/listausuarios";
    public static final String FILE_NAME2 = "/listahoras";

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
                ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(fichero,true)){
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
                oos2.writeObject(usr);
                oos2.flush();
                oos2.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean checkUser(String name,String pwd,Context c) throws IOException, ClassNotFoundException {
        boolean check= false;

        File fichero= new File(c.getApplicationContext().getFilesDir().getPath()+FILE_NAME2);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
        usuario usr=(usuario) ois.readObject();

        while (usr != null){
            if(usr.getUsername().equals(name) && usr.getPassword().equals(pwd)){
                check=true;
                break;
            }
            usr=(usuario) ois.readObject();
        }
        return check;

    }

    public static void addHora( Context c){
        File fichero= new File(c.getApplicationContext().getFilesDir().getPath()+FILE_NAME2);
        Fichaje fich = new Fichaje();

        try {
            if(!fichero.exists()) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(fich);
                oos.flush();
                oos.close();
            }
            else{
                ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(fichero,true)){
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
                oos2.writeObject(fich);
                oos2.flush();
                oos2.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static ArrayList<Fichaje> listFichajes(Context c) throws IOException, ClassNotFoundException {
        ArrayList<Fichaje> listaHoras= new ArrayList<>();

        File fichero= new File(c.getApplicationContext().getFilesDir().getPath()+FILE_NAME2);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
        Fichaje fch=(Fichaje) ois.readObject();

        while (fch != null){
            listaHoras.add(fch);
            fch=(Fichaje) ois.readObject();
        }
        return listaHoras;

    }






    }



