package com.nicootech.daggerexcercise.ui.auth;

import android.util.Log;

import com.nicootech.daggerexcercise.di.models.User;
import com.nicootech.daggerexcercise.network.auth.AuthApi;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    private MediatorLiveData<AuthResource<User>> authUser = new MediatorLiveData<>();

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: viewmodel is working...");

    }

    public void authenticateWithId(int userId){
        authUser.setValue(AuthResource.loading((User)null));

        final LiveData<AuthResource<User>> source = LiveDataReactiveStreams.fromPublisher(

                authApi.getUser(userId)

                        // instead of calling onError (error happens)
                        .onErrorReturn(new Function<Throwable, User>() {
                            @NonNull
                            @Override
                            public User apply(@NonNull Throwable throwable) throws Exception {
                                User errorUser = new User();
                                errorUser.setId(-1);
                                return errorUser;
                            }
                        })
                        .map(new Function<User, AuthResource<User>>() {
                            @NonNull
                            @Override
                            public AuthResource<User> apply(@NonNull User user) throws Exception {
                                if(user.getId() == -1){
                                    return AuthResource.error("Could not authenticate", (User)null);
                                }
                                // if there is no Error
                                return AuthResource.authenticated(user);
                            }
                        })

                .subscribeOn(Schedulers.io())
        );

        authUser.addSource(source, new Observer<AuthResource<User>>() {
            @Override
            public void onChanged(AuthResource<User> user) {
                authUser.setValue(user);
                authUser.removeSource(source);
            }
        });
    }
    public LiveData<AuthResource<User>> observeUser(){
        return authUser;
    }

}
