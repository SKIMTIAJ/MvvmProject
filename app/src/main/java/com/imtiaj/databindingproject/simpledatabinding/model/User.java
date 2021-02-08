package com.imtiaj.databindingproject.simpledatabinding.model;

import com.imtiaj.databindingproject.BR;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {

    String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    @Bindable
    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

}
