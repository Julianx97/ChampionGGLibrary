package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:37 AM */

import java.util.List;

public class RuneList {
    public class Rune {
        private int id;
        private int number;
        private String name;
        private String description;

        public Rune(int id, int number, String name, String description) {
            this.id = id;
            this.number = number;
            this.name = name;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    public class RuneSet {
        private List<Rune> runes;
        private double winPercent;
        private long games;

        public RuneSet(List<Rune> runes, double winPercent, long games) {
            this.runes = runes;
            this.winPercent = winPercent;
            this.games = games;
        }

        public List<Rune> getRunes() {
            return runes;
        }

        public double getWinPercent() {
            return winPercent;
        }

        public long getGames() {
            return games;
        }
    }

    private RuneSet mostGames;
    private RuneSet highestWinPercent;

    public RuneList(RuneSet mostGames, RuneSet highestWinPercent) {
        this.mostGames = mostGames;
        this.highestWinPercent = highestWinPercent;
    }

    public RuneSet getMostGames() {
        return mostGames;
    }

    public RuneSet getHighestWinPercent() {
        return highestWinPercent;
    }
}
