package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:26 AM */

import java.util.List;

public class ItemList {
    public class Item {
        private int id;
        private String name;

        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public class ItemListSet {
        private List<Item> items;
        private double winPercent;
        private int games;

        public ItemListSet(List<Item> items, double winPercent, int games) {
            this.items = items;
            this.winPercent = winPercent;
            this.games = games;
        }

        public List<Item> getItems() {
            return items;
        }

        public double getWinPercent() {
            return winPercent;
        }

        public int getGames() {
            return games;
        }
    }

    private ItemListSet mostGames;
    private ItemListSet highestWinPercent;

    public ItemList(ItemListSet mostGames, ItemListSet highestWinPercent) {
        this.mostGames = mostGames;
        this.highestWinPercent = highestWinPercent;
    }

    public ItemListSet getMostGames() {
        return mostGames;
    }

    public ItemListSet getHighestWinPercent() {
        return highestWinPercent;
    }
}
