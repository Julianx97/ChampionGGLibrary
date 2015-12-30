package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:41 AM */

public class General {
    public class GeneralStat {
        private int change;
        private int position;

        public GeneralStat(int change, int position) {
            this.change = change;
            this.position = position;
        }

        public int getChange() {
            return change;
        }

        public int getPosition() {
            return position;
        }
    }

    private GeneralStat winPercent;
    private GeneralStat playPercent;
    private GeneralStat banRate;
    private GeneralStat experience;
    private GeneralStat goldEarned;
    private GeneralStat assists;
    private GeneralStat deaths;
    private GeneralStat kills;
    private GeneralStat totalHeal;
    private GeneralStat visionWardsBoughtInGame;
    private GeneralStat wardsPlaced;
    private GeneralStat wardsKilled;
    private GeneralStat totalDamageDealtToChampions;
    private GeneralStat largestKillingSpree;
    private GeneralStat minionsKilled;

    public General(GeneralStat winPercent, GeneralStat playPercent, GeneralStat banRate, GeneralStat experience, GeneralStat goldEarned, GeneralStat assists, GeneralStat deaths, GeneralStat kills, GeneralStat totalHeal, GeneralStat visionWardsBoughtInGame, GeneralStat wardsPlaced, GeneralStat wardsKilled, GeneralStat totalDamageDealtToChampions, GeneralStat largestKillingSpree, GeneralStat minionsKilled) {
        this.winPercent = winPercent;
        this.playPercent = playPercent;
        this.banRate = banRate;
        this.experience = experience;
        this.goldEarned = goldEarned;
        this.assists = assists;
        this.deaths = deaths;
        this.kills = kills;
        this.totalHeal = totalHeal;
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        this.wardsPlaced = wardsPlaced;
        this.wardsKilled = wardsKilled;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.largestKillingSpree = largestKillingSpree;
        this.minionsKilled = minionsKilled;
    }

    public GeneralStat getTotalHeal() {
        return totalHeal;
    }

    public GeneralStat getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public GeneralStat getWardsPlaced() {
        return wardsPlaced;
    }

    public GeneralStat getWardsKilled() {
        return wardsKilled;
    }

    public GeneralStat getWinPercent() {
        return winPercent;
    }

    public GeneralStat getPlayPercent() {
        return playPercent;
    }

    public GeneralStat getBanRate() {
        return banRate;
    }

    public GeneralStat getExperience() {
        return experience;
    }

    public GeneralStat getGoldEarned() {
        return goldEarned;
    }

    public GeneralStat getKills() {
        return kills;
    }

    public GeneralStat getDeaths() {
        return deaths;
    }

    public GeneralStat getAssists() {
        return assists;
    }

    public GeneralStat getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public GeneralStat getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public GeneralStat getMinionsKilled() {
        return minionsKilled;
    }
}
