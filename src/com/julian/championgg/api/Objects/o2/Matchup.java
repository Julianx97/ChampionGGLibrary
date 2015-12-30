package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:39 AM */

public class Matchup {
    private long games;
    private double statScore;
    private double winRate;
    private double winRateChange;
    private String key;

    public Matchup(long games, double statScore, double winRate, double winRateChange, String key) {
        this.games = games;
        this.statScore = statScore;
        this.winRate = winRate;
        this.winRateChange = winRateChange;
        this.key = key;
    }

    public long getGames() {
        return games;
    }

    public double getStatScore() {
        return statScore;
    }

    public double getWinRate() {
        return winRate;
    }

    public double getWinRateChange() {
        return winRateChange;
    }

    public String getKey() {
        return key;
    }
}
