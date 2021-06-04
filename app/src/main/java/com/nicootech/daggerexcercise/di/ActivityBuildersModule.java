package com.nicootech.daggerexcercise.di;

import com.nicootech.daggerexcercise.di.auth.AuthModule;
import com.nicootech.daggerexcercise.di.auth.AuthScope;
import com.nicootech.daggerexcercise.di.auth.AuthViewModelsModule;
import com.nicootech.daggerexcercise.di.main.MainFragmentBuilderModule;
import com.nicootech.daggerexcercise.di.main.MainModule;
import com.nicootech.daggerexcercise.di.main.MainScope;
import com.nicootech.daggerexcercise.di.main.MainViewModelModule;
import com.nicootech.daggerexcercise.ui.auth.AuthActivity;
import com.nicootech.daggerexcercise.ui.main.MainActivity;
import com.nicootech.daggerexcercise.ui.main.profile.ProfileViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuilderModule.class, MainViewModelModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();


}
