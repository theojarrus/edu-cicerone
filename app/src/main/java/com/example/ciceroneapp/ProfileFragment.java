package com.example.ciceroneapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ciceroneapp.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private static final String ARG_LINK = "arg_link";

    private FragmentProfileBinding binding;

    public static ProfileFragment newInstance(String link) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle arguments = new Bundle();
        arguments.putString(ARG_LINK, link);
        fragment.setArguments(arguments);
        return fragment;
    }

    public ProfileFragment() {
        super(R.layout.fragment_profile);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);

        String link = requireArguments().getString(ARG_LINK);
        binding.text.setText(link);

        return binding.getRoot();
    }
}
