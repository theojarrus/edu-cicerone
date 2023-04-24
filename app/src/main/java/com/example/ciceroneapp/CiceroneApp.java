package com.example.ciceroneapp;

import android.app.Application;

import com.github.terrakok.cicerone.Cicerone;

public class CiceroneApp extends Application {

    private Cicerone cicerone;

    public Cicerone getCicerone() {
        if (cicerone == null) cicerone = Cicerone.create();
        return cicerone;
    }
}
