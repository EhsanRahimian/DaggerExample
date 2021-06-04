package com.nicootech.daggerexcercise.ui.main.profile;

import android.util.Log;

import com.nicootech.daggerexcercise.SessionManager;
import com.nicootech.daggerexcercise.models.User;
import com.nicootech.daggerexcercise.ui.auth.AuthResource;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private static final String TAG = "ProfileViewModel";

    private final SessionManager sessionManager;

    @Inject
    public ProfileViewModel(SessionManager sessionManager){
        this.sessionManager = sessionManager;
        Log.d(TAG, "ProfileViewModel: viewmodel is ready...");
    }

    public LiveData<AuthResource<User>> getAuthenticatedUser(){
        return  sessionManager.getAuthUser();
    }



}
