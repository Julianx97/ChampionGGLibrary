package com.julian.championgg.api.Objects;
/* Coded by Julian, 12/30/2015, 12:20 AM */

import com.julian.championgg.api.Objects.o2.*;
import com.julian.championgg.api.Objects.o2.ItemList;
import com.julian.championgg.api.Objects.o2.RuneList;
import com.julian.championgg.api.Objects.o2.SummonerList;

import java.util.List;

public class ChampionDataDetailed {
    private String key;
    private String role;
    private OverallPosition overallPosition;
    private ItemList items;
    private ItemList firstItems;
    private List<Double> championMatrix;
    private List<Trinket> trinkets;
    private SummonerList summoners;
    private RuneList runes;
    private List<Double> experienceRate;
    private List<Double> experienceSample;
    private List<Double> patchWin;
    private List<Double> patchPlay;
    private DamageComposition dmgComposition;
    private List<Matchup> matchups;
    private General general;
    private Skills skills;
    private Masteries masteries;

    public ChampionDataDetailed(String key, String role, OverallPosition overallPosition, ItemList items, ItemList firstItems, List<Double> championMatrix, List<Trinket> trinkets, SummonerList summoners, RuneList runes, List<Double> experienceRate, List<Double> experienceSample, List<Double> patchWin, List<Double> patchPlay, DamageComposition dmgComposition, List<Matchup> matchups, General general, Skills skills, Masteries masteries) {
        this.key = key;
        this.role = role;
        this.overallPosition = overallPosition;
        this.items = items;
        this.firstItems = firstItems;
        this.championMatrix = championMatrix;
        this.trinkets = trinkets;
        this.summoners = summoners;
        this.runes = runes;
        this.experienceRate = experienceRate;
        this.experienceSample = experienceSample;
        this.patchWin = patchWin;
        this.patchPlay = patchPlay;
        this.dmgComposition = dmgComposition;
        this.matchups = matchups;
        this.general = general;
        this.skills = skills;
        this.masteries = masteries;
    }

    public Skills getSkills() {
        return skills;
    }

    public String getKey() {
        return key;
    }

    public String getRole() {
        return role;
    }

    public OverallPosition getOverallPosition() {
        return overallPosition;
    }

    public ItemList getItems() {
        return items;
    }

    public ItemList getFirstItems() {
        return firstItems;
    }

    public List<Double> getChampionMatrix() {
        return championMatrix;
    }

    public List<Trinket> getTrinkets() {
        return trinkets;
    }

    public SummonerList getSummoners() {
        return summoners;
    }

    public RuneList getRunes() {
        return runes;
    }

    public List<Double> getExperienceRate() {
        return experienceRate;
    }

    public List<Double> getExperienceSample() {
        return experienceSample;
    }

    public List<Double> getPatchWin() {
        return patchWin;
    }

    public List<Double> getPatchPlay() {
        return patchPlay;
    }

    public DamageComposition getDmgComposition() {
        return dmgComposition;
    }

    public List<Matchup> getMatchups() {
        return matchups;
    }

    public General getGeneral() {
        return general;
    }

    public Masteries getMasteries() {
        return masteries;
    }
}