package com.example.apa.View;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apa.R;
import com.example.apa.ViewModel.RegistrarHorasViewModel;

public class RegistrarHoras extends Fragment {

    private RegistrarHorasViewModel mViewModel;

    public static RegistrarHoras newInstance() {
        return new RegistrarHoras();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.registrar_horas_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RegistrarHorasViewModel.class);
        // TODO: Use the ViewModel
    }

}
