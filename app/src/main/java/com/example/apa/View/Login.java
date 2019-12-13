package com.example.apa.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.apa.R;
import com.example.apa.ViewModel.LoginViewModel;

import java.io.IOException;


public class Login extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText username, password;
    private Button register,  login;
    LoginViewModel loginViewModel;



    public Login() {
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Login newInstance(String param1, String param2) {
        Login fragment = new Login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);

        View ui_layout  = inflater.inflate(R.layout.fragment_login, container, false);



        username=ui_layout.findViewById(R.id.username_field);
        password=ui_layout.findViewById(R.id.password_field);
        register=ui_layout.findViewById(R.id.register_button);
        login=ui_layout.findViewById(R.id.login_button);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,new RegisterFragment()).commit();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (LoginViewModel.login_function(username.getText().toString(),password.getText().toString(),getContext())) {
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, new Home()).commit();
                    }
                    else{
                        Toast toast= Toast.makeText(getContext(),"Username or password is wrong",Toast.LENGTH_SHORT);
                        toast.show();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        return ui_layout;


    }




}
