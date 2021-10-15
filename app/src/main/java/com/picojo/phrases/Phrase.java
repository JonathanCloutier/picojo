package com.picojo.phrases;

import com.picojo.settings.Settings;

public class Phrase {

    private static final String SIP_INDICATOR = "%d";
    private static final String PLAYER_INDICATOR = "%s";

    private String question = "You should never see this";
    private long sips = 1;
    private String[] tags = new String[0];

    public Phrase(String question) {
        this.question = question;
    }

    public Phrase(String question, long sips, String... tags) {
        this.question = question;
        this.sips = sips;
        this.tags = tags;
    }

    public String getQuestion() {
        System.out.println(question);
        String result = addPlayers(question);
        return addSips(result);
    }

    private String addPlayers(String question) {
        Integer playersRequired = getNumberOfPlayerRequired();

        String[] players = Settings.getRandomPlayers(playersRequired);
        for (String player: players) {
            question = question.replaceFirst(PLAYER_INDICATOR, player);
        }

        return question;
    }

    private String addSips(String question) {
        Long actualSips = (long) (sips  * Settings.getDifficulty());
        question = question.replaceAll(SIP_INDICATOR, actualSips.toString());

        return question;
    }

    public Integer getNumberOfPlayerRequired() {
        return Integer.valueOf(question.split(PLAYER_INDICATOR, -1).length-1);
    }

}
