package com.nicootech.daggerexcercise.ui.main.posts;

import android.util.Log;

import com.nicootech.daggerexcercise.SessionManager;
import com.nicootech.daggerexcercise.network.main.MainApi;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

public class PostsViewModel extends ViewModel {

    private static final String TAG = "PostsViewModel";

    //inject
    private final SessionManager sessionManager;
    private final MainApi mainApi;

    @Inject
    public PostsViewModel(SessionManager sessionManager, MainApi mainApi) {
        this.sessionManager = sessionManager;
        this.mainApi = mainApi;
        Log.d(TAG, "PostsViewModel: viewmodel is working...");

    }


}
