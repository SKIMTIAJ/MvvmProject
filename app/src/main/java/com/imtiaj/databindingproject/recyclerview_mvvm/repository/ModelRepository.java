package com.imtiaj.databindingproject.recyclerview_mvvm.repository;

import com.imtiaj.databindingproject.recyclerview_mvvm.model.ModelClass;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class ModelRepository {

    private static ModelRepository instance;
    private ArrayList<ModelClass> modelClassList = new ArrayList<>();


    public static ModelRepository getInstance() {
        if (instance == null)
            instance = new ModelRepository();

        return instance;

    }

    public MutableLiveData<List<ModelClass>> getData() {
        setData();
        MutableLiveData<List<ModelClass>> data = new MutableLiveData<>();
        data.setValue(modelClassList);
        return data;

    }

    private void setData() {
        modelClassList.add(new ModelClass("Encoders Tech"));
        modelClassList.add(new ModelClass("Encoders Tech pvt.ltd"));
        modelClassList.add(new ModelClass("Encoders Technology"));
        modelClassList.add(new ModelClass("Encoders Technology pvt.ltd"));
        modelClassList.add(new ModelClass("Encoders Technology private Ltd"));
        modelClassList.add(new ModelClass("Encoders Technology private Limited"));
    }
}
