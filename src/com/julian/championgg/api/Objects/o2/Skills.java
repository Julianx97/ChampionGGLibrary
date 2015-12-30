package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:43 AM */

import java.util.List;

public class Skills {
    public class SkillInfo {
        private String name;
        private String key;

        public SkillInfo(String name, String key) {
            this.name = name;
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public String getKey() {
            return key;
        }
    }

    public class SkillOrder {
        private List<String> order;
        private double winPercent;
        private long games;

        public SkillOrder(List<String> order, double winPercent, long games) {
            this.order = order;
            this.winPercent = winPercent;
            this.games = games;
        }

        public List<String> getOrder() {
            return order;
        }

        public double getWinPercent() {
            return winPercent;
        }

        public long getGames() {
            return games;
        }
    }

    private List<SkillInfo> skillInfo;
    private SkillOrder mostGames;
    private SkillOrder highestWinPercent;

    public Skills(List<SkillInfo> skillInfo, SkillOrder mostGames, SkillOrder highestWinPercent) {
        this.skillInfo = skillInfo;
        this.mostGames = mostGames;
        this.highestWinPercent = highestWinPercent;
    }

    public List<SkillInfo> getSkillInfo() {
        return skillInfo;
    }

    public SkillOrder getMostGames() {
        return mostGames;
    }

    public SkillOrder getHighestWinPercent() {
        return highestWinPercent;
    }
}
