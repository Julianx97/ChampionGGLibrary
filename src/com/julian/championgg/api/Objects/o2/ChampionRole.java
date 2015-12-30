package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:05 AM */

public class ChampionRole {
    private String name;
    private double percentPlayed;
    private long games;

    public ChampionRole(String name, double percentPlayed, long games) {
        this.name = name;
        this.percentPlayed = percentPlayed;
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public double getPercentPlayed() {
        return percentPlayed;
    }

    public long getGames() {
        return games;
    }
}
