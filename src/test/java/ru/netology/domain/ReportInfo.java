package ru.netology.domain;

public class ReportInfo {
    private boolean spam;
    private boolean abuse;
    private boolean adultMaterial;
    private boolean childPorn;
    private boolean drugPropaganda;
    private boolean weaponSales;
    private boolean violence;
    private boolean callForBulling;
    private boolean callForSuicide;
    private boolean animalAbuse;
    private boolean misleading;
    private boolean fraud;
    private boolean extremism;
    private boolean hostileSpeech;
    private boolean unoriginalContent;

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public void setAbuse(boolean abuse) {
        this.abuse = abuse;
    }

    public void setAdultMaterial(boolean adultMaterial) {
        this.adultMaterial = adultMaterial;
    }

    public void setChildPorn(boolean childPorn) {
        this.childPorn = childPorn;
    }

    public void setDrugPropaganda(boolean drugPropaganda) {
        this.drugPropaganda = drugPropaganda;
    }

    public void setWeaponSales(boolean weaponSales) {
        this.weaponSales = weaponSales;
    }

    public void setViolence(boolean violence) {
        this.violence = violence;
    }

    public void setCallForBulling(boolean callForBulling) {
        this.callForBulling = callForBulling;
    }

    public void setCallForSuicide(boolean callForSuicide) {
        this.callForSuicide = callForSuicide;
    }

    public void setAnimalAbuse(boolean animalAbuse) {
        this.animalAbuse = animalAbuse;
    }

    public void setMisleading(boolean misleading) {
        this.misleading = misleading;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public void setExtremism(boolean extremism) {
        this.extremism = extremism;
    }

    public void setHostileSpeech(boolean hostileSpeech) {
        this.hostileSpeech = hostileSpeech;
    }

    public void setUnoriginalContent(boolean unoriginalContent) {
        this.unoriginalContent = unoriginalContent;
    }
}
