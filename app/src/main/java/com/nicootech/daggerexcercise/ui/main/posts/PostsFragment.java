package com.nicootech.daggerexcercise.ui.main.posts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicootech.daggerexcercise.R;
import com.nicootech.daggerexcercise.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.support.DaggerFragment;

public class PostsFragment extends DaggerFragment {

    private static final String TAG = "PostsFragment";

    private PostsViewModel viewModel;
    //private RecyclerView recyclerView;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_posts, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //recyclerView = view.findViewById(R.id.recycler_view);

        viewModel = new ViewModelProvider(this, providerFactory).get(PostsViewModel.class);
    }


}


