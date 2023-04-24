package com.example.ciceroneapp;

import static com.example.ciceroneapp.AppScreens.ProfileScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ciceroneapp.databinding.FragmentDashboardBinding;
import com.github.terrakok.cicerone.Cicerone;
import com.github.terrakok.cicerone.Router;

public class DashboardFragment extends Fragment {

    private Cicerone cicerone;
    private Router router;

    private FragmentDashboardBinding binding;

    public static DashboardFragment newInstance() {
        return new DashboardFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cicerone = ((CiceroneApp) requireActivity().getApplication()).getCicerone();
        router = (Router) cicerone.getRouter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);

        binding.openProfile.setOnClickListener(v -> router.navigateTo(ProfileScreen("profilelink.com")));

        return binding.getRoot();
    }
}
