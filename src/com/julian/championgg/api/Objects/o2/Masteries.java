package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:46 AM */

import java.util.List;

public class Masteries {
    public class MasteryInfo {
        private double winPercent;
        private long games;
        private List<Masteries.MasteryData> masteries;

        public MasteryInfo(double winPercent, long games, List<Masteries.MasteryData> masteries) {
            this.winPercent = winPercent;
            this.games = games;
            this.masteries = masteries;
        }

        public double getWinPercent() {
            return winPercent;
        }

        public long getGames() {
            return games;
        }

        public List<Masteries.MasteryData> getMasteries() {
            return masteries;
        }
    }

    public class MasteryDataSet {
        private int points;
        private int mastery;

        public MasteryDataSet(int points, int mastery) {
            this.points = points;
            this.mastery = mastery;
        }

        public int getPoints() {
            return points;
        }

        public int getMastery() {
            return mastery;
        }
    }

    public class MasteryData {
        private String tree;
        private int total;
        private List<MasteryDataSet> data;

        public MasteryData(String tree, int total, List<MasteryDataSet> data) {
            this.tree = tree;
            this.total = total;
            this.data = data;
        }

        public String getTree() {
            return tree;
        }

        public int getTotal() {
            return total;
        }

        public List<MasteryDataSet> getData() {
            return data;
        }
    }

    private MasteryInfo mostGames;
    private MasteryInfo highestWinPercent;

    public Masteries(MasteryInfo mostGames, MasteryInfo highestWinPercent) {
        this.mostGames = mostGames;
        this.highestWinPercent = highestWinPercent;
    }

    public MasteryInfo getMostGames() {
        return mostGames;
    }

    public MasteryInfo getHighestWinPercent() {
        return highestWinPercent;
    }
}
