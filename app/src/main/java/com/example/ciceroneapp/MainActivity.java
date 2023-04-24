package com.example.ciceroneapp;

import static com.example.ciceroneapp.AppScreens.DashboardScreen;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.github.terrakok.cicerone.Cicerone;
import com.github.terrakok.cicerone.Navigator;
import com.github.terrakok.cicerone.NavigatorHolder;
import com.github.terrakok.cicerone.Router;
import com.github.terrakok.cicerone.androidx.AppNavigator;

public class MainActivity extends FragmentActivity {

    private Cicerone cicerone;
    private Router router;
    private NavigatorHolder navigatorHolder;

    private final Navigator navigator = new AppNavigator(this, R.id.container);

    public MainActivity() {
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cicerone = ((CiceroneApp) getApplication()).getCicerone();
        router = (Router) cicerone.getRouter();
        navigatorHolder = cicerone.getNavigatorHolder();

        if (savedInstanceState == null) router.navigateTo(DashboardScreen());
    }

    @Override
    protected void onResume() {
        super.onResume();
        navigatorHolder.setNavigator(navigator);
    }

    @Override
    protected void onPause() {
        navigatorHolder.removeNavigator();
        super.onPause();
    }
}
