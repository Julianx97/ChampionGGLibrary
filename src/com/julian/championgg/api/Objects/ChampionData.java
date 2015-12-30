package com.julian.championgg.api.Objects;
/* Coded by Julian, 12/30/2015, 12:05 AM */

import com.julian.championgg.api.Objects.o2.ChampionRole;

import java.util.List;

public class ChampionData {
    private String key;
    private long lastUpdated;
    private String name;
    private List<ChampionRole> roles;

    public ChampionData(String key, long lastUpdated, String name, List<ChampionRole> roles) {
        this.key = key;
        this.lastUpdated = lastUpdated;
        this.name = name;
        this.roles = roles;
    }

    public String getKey() {
        return key;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public String getName() {
        return name;
    }

    public List<ChampionRole> getRoles() {
        return roles;
    }
}
