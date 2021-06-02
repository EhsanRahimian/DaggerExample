package com.nicootech.daggerexcercise.di.auth;

import com.nicootech.daggerexcercise.network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModule {
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }
}
