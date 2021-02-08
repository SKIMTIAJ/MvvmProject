package com.imtiaj.databindingproject.recyclerview_mvvm.viewmodel;

import com.imtiaj.databindingproject.recyclerview_mvvm.model.ModelClass;
import com.imtiaj.databindingproject.recyclerview_mvvm.repository.ModelRepository;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelClass extends ViewModel {

    private MutableLiveData<List<ModelClass>> mModelList;
    private ModelRepository modelRepository;



    public void init(){
        if (mModelList!=null)
            return;

        modelRepository = ModelRepository.getInstance();
        mModelList = modelRepository.getData();
    }

    public LiveData<List<ModelClass>> getData() {
        return mModelList;
    }
}
