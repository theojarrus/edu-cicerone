package com.example.ciceroneapp;

import com.github.terrakok.cicerone.androidx.FragmentScreen;

public class AppScreens {

    public static FragmentScreen DashboardScreen() {
        return FragmentScreen.Companion.invoke(null, true, fragmentFactory ->
                DashboardFragment.newInstance()
        );
    }

    public static FragmentScreen ProfileScreen(String link) {
        return FragmentScreen.Companion.invoke(null, true, fragmentFactory ->
                ProfileFragment.newInstance(link)
        );
    }
}
