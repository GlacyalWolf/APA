package com.example.apa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.apa.View.Login;
import com.example.apa.View.RegisterFragment;

public class MainActivity extends AppCompatActivity {
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.container, new Login()).commit();
    }
}
