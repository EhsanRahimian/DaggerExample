package com.nicootech.daggerexcercise.di.auth;

import com.nicootech.daggerexcercise.di.ViewModelKey;
import com.nicootech.daggerexcercise.ui.auth.AuthViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
