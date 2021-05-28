package com.nicootech.daggerexcercise.di;

import android.app.Application;

import com.nicootech.daggerexcercise.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class
        })

public interface AppComponent extends AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder{

        @BindsInstance// we do not always have to do
        Builder application(Application application);

        AppComponent build();
    }
}
