package com.nicootech.daggerexcercise.network.auth;

import com.nicootech.daggerexcercise.di.models.User;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthApi {

    // /users/id
    @GET("users/{id}")
    Flowable<User> getUser(
            @Path("id") int id
    );
}
