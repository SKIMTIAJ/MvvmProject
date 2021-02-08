package com.imtiaj.databindingproject.recyclerview_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.imtiaj.databindingproject.R;
import com.imtiaj.databindingproject.recyclerview_mvvm.adapter.RecyclerviewAdaper;
import com.imtiaj.databindingproject.recyclerview_mvvm.viewmodel.ViewModelClass;

public class MvvmActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerviewAdaper adaper;
    private ViewModelClass viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        recyclerView = findViewById(R.id.recyclerView);
        viewModel = ViewModelProviders.of(MvvmActivity.this).get(ViewModelClass.class);
        viewModel.init();


        adaper = new RecyclerviewAdaper(MvvmActivity.this,viewModel.getData().getValue());
        recyclerView.setAdapter(adaper);
    }
}