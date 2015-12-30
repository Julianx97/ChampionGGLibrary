package com.julian.championgg.api.Objects.o2;
/* Coded by Julian, 12/30/2015, 12:38 AM */

public class DamageComposition {
    private double trueDmg;
    private double magicDmg;
    private double physicalDmg;

    public DamageComposition(double magicDmg, double trueDmg, double physicalDmg) {
        this.magicDmg = magicDmg;
        this.trueDmg = trueDmg;
        this.physicalDmg = physicalDmg;
    }

    public double getTrueDmg() {
        return trueDmg;
    }

    public double getMagicDmg() {
        return magicDmg;
    }

    public double getPhysicalDmg() {
        return physicalDmg;
    }
}
