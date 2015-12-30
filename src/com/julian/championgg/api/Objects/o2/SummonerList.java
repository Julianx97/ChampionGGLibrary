package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:33 AM */

public class SummonerList {
    public class SummonerSpell {
        private String name;

        public SummonerSpell(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class SummonerSpellSet {
        private SummonerSpell summoner1;
        private SummonerSpell summoner2;
        private double winPercent;
        private long games;

        public SummonerSpellSet(SummonerSpell summoner1, SummonerSpell summoner2, double winPercent, long games) {
            this.summoner1 = summoner1;
            this.summoner2 = summoner2;
            this.winPercent = winPercent;
            this.games = games;
        }

        public SummonerSpell getSummoner1() {
            return summoner1;
        }

        public SummonerSpell getSummoner2() {
            return summoner2;
        }

        public double getWinPercent() {
            return winPercent;
        }

        public long getGames() {
            return games;
        }
    }

    private SummonerSpellSet mostGames;
    private SummonerSpellSet highestWinPercent;

    public SummonerList(SummonerSpellSet mostGames, SummonerSpellSet highestWinPercent) {
        this.mostGames = mostGames;
        this.highestWinPercent = highestWinPercent;
    }

    public SummonerSpellSet getMostGames() {
        return mostGames;
    }

    public SummonerSpellSet getHighestWinPercent() {
        return highestWinPercent;
    }
}
