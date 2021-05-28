package com.nicootech.daggerexcercise.di;

import com.nicootech.daggerexcercise.AuthActivity;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();  // this could be literally anything like line bellow
    //abstract AuthActivity ytgrfdeswaq();


}
