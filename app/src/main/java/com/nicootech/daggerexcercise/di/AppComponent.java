package com.nicootech.daggerexcercise.di;

import android.app.Application;

import com.nicootech.daggerexcercise.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton // we're telling dagger the appComponent owns the singleton scope
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,

        })

public interface AppComponent extends AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder{

        @BindsInstance// we do not always have to do
        Builder application(Application application);

        AppComponent build();
    }
}
