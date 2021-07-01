package com.picojo.settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Settings {
    private static List<String> players = new ArrayList();
    private static List<String> customPhrases = new ArrayList();

    public static List<String> getPhrases() {
        return customPhrases;
    }

    public static void addPhrase(String phrase) {
        customPhrases.add(phrase);
    }

    public static String getPhrase(int index) {
        return customPhrases.get(index);
    }

    public static String removePhrase(int index) {
        return customPhrases.remove(index);
    }

    public static int getPhraseCount() {
        return customPhrases.size();
    }

    public static void addPlayer(String phrase) {
        players.add(phrase);
    }

    public static String getPlayer(int index) {
        return players.get(index);
    }

    public static String removePlayer(int index) {
        return players.remove(index);
    }

    public static int getPlayerCount() {
        return players.size();
    }

    public static Object[] getRandomPlayers(int amountOfPlayers) {
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
}
