package com.picojo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.picojo.databinding.ActivityMainBinding;
import com.picojo.settings.Settings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    NavController settingsController;
    private SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        settingsController = navController;
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        settings = getSharedPreferences("Settings", 0);
        Settings.setSettings(settings);
        loadSettings();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void accessPlayerSettings(MenuItem item) {
        if (settingsController.getCurrentDestination().getId() != R.id.PlayerFragment) {
            settingsController.navigate(R.id.action_to_PlayerFragment);
        }
    }

    public void accessPhraseSettings(MenuItem item) {
        if (settingsController.getCurrentDestination().getId() != R.id.PhraseFragment) {
            settingsController.navigate(R.id.action_to_PhraseFragment);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }

    private void loadSettings() {
        loadPlayers();
        loadCustomPhrases();
    }

    private void loadPlayers() {
        Settings.setPlayers(parseStringIntoArray(settings.getString("Players", "")));
    }

    private void loadCustomPhrases() {
        Settings.setCustomPhrases(parseStringIntoArray(settings.getString("Phrases", "")));
    }

    private static List<String> parseStringIntoArray(String string) {
        String[] strings = string.replace("[", "").replace("]", "").split(", ");
        List<String> results =  new ArrayList<>(Arrays.asList(strings));
        results.remove("");

        return results;
    }

}