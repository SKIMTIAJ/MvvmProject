package com.imtiaj.databindingproject.simpledatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.imtiaj.databindingproject.R;
import com.imtiaj.databindingproject.databinding.ActivityDataBindingBinding;
import com.imtiaj.databindingproject.recyclerview_mvvm.MvvmActivity;
import com.imtiaj.databindingproject.simpledatabinding.model.User;

public class DataBindingActivity extends AppCompatActivity{

    ActivityDataBindingBinding dataBindingBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dataBindingBinding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);
        dataBindingBinding.setUser(new User("Imtiaj"));

        dataBindingBinding.setClickHandler(new DataBindingActivity());
    }

    public void clickMethod(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), MvvmActivity.class));
        Log.d("Activity Test","clicked");
    }
}