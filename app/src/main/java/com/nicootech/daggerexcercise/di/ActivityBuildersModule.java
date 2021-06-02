package com.nicootech.daggerexcercise.di;

import com.nicootech.daggerexcercise.di.auth.AuthModule;
import com.nicootech.daggerexcercise.di.auth.AuthViewModelsModule;
import com.nicootech.daggerexcercise.di.main.MainFragmentBuilderModule;
import com.nicootech.daggerexcercise.ui.auth.AuthActivity;
import com.nicootech.daggerexcercise.ui.main.MainActivity;

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
    @ContributesAndroidInjector(
            modules = {MainFragmentBuilderModule.class}
    )
    abstract MainActivity contributeMainActivity();


}
