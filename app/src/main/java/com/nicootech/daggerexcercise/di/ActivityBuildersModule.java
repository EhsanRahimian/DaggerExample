package com.nicootech.daggerexcercise.di;

import com.nicootech.daggerexcercise.di.auth.AuthModule;
import com.nicootech.daggerexcercise.di.auth.AuthViewModelsModule;
import com.nicootech.daggerexcercise.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();  //The name is convention,
    // means this could be literally anything like line bellow
    //abstract AuthActivity ytgrfdeswaq();


}
