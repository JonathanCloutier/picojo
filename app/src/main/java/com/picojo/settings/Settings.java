package com.picojo.settings;

import android.content.SharedPreferences;

import com.picojo.phrases.Phrase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Settings {
    private static List<String> players = new ArrayList();
    private static List<String> customPhrases = new ArrayList();
    private static float difficulty = 1;
    private static SharedPreferences settings;

    public static void setSettings(SharedPreferences settings) {
        Settings.settings = settings;
    }

    public static List<Phrase> getPhrases() {
        return customPhrases.stream().map(phrase -> new Phrase(phrase)).collect(Collectors.toList());
    }

    public static void addPhrase(String phrase) {
        customPhrases.add(phrase);
        savePhrases();
    }

    public static String getPhrase(int index) {
        return customPhrases.get(index);
    }

    public static void removePhrase(int index) {
        customPhrases.remove(index);
        savePhrases();
    }

    public static int getPhraseCount() {
        return customPhrases.size();
    }

    public static void addPlayer(String phrase) {
        players.add(phrase);
        savePlayers();
    }

    public static String getPlayer(int index) {
        return players.get(index);
    }

    public static void removePlayer(int index) {
        players.remove(index);
        savePlayers();
    }

    public static int getPlayerCount() {
        return players.size();
    }

    public static void setPlayers(List<String> players) {
        Settings.players = players;
    }

    public static void setCustomPhrases(List<String> customPhrases) {
        Settings.customPhrases = customPhrases;
    }

    public static float getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(float newDifficulty) {
        difficulty = newDifficulty;
        saveDifficulty();
    }

    public static String[] getRandomPlayers(int amountOfPlayers) {
        List<String> allPlayers = new ArrayList<>(players);
        List<String> selectedPlayers = new ArrayList();

        for (int i=0; i < amountOfPlayers; i++) {
            String selectedPlayer = getRandomPlayer(allPlayers);
            selectedPlayers.add(selectedPlayer);
            allPlayers.remove(selectedPlayer);
        }

        return selectedPlayers.toArray(new String[selectedPlayers.size()]);
    }

    private static String getRandomPlayer(List<String> fromPlayers) {
        Random rand = new Random();
        return fromPlayers.get(rand.nextInt(fromPlayers.size()));
    }

    private static void savePhrases() {
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("Phrases", Arrays.toString(customPhrases.toArray()));
        editor.commit();
    }

    private static void savePlayers() {
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("Players", Arrays.toString(players.toArray()));
        editor.commit();
    }

    private static void saveDifficulty() {
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("Difficulty", Float.toString(difficulty));
        editor.commit();
    }
}
