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

    public boolean isSpam() {
        return spam;
    }

    public void setSpam(boolean spam) {
        this.spam = spam;
    }

    public boolean isAbuse() {
        return abuse;
    }

    public void setAbuse(boolean abuse) {
        this.abuse = abuse;
    }

    public boolean isAdultMaterial() {
        return adultMaterial;
    }

    public void setAdultMaterial(boolean adultMaterial) {
        this.adultMaterial = adultMaterial;
    }

    public boolean isChildPorn() {
        return childPorn;
    }

    public void setChildPorn(boolean childPorn) {
        this.childPorn = childPorn;
    }

    public boolean isDrugPropaganda() {
        return drugPropaganda;
    }

    public void setDrugPropaganda(boolean drugPropaganda) {
        this.drugPropaganda = drugPropaganda;
    }

    public boolean isWeaponSales() {
        return weaponSales;
    }

    public void setWeaponSales(boolean weaponSales) {
        this.weaponSales = weaponSales;
    }

    public boolean isViolence() {
        return violence;
    }

    public void setViolence(boolean violence) {
        this.violence = violence;
    }

    public boolean isCallForBulling() {
        return callForBulling;
    }

    public void setCallForBulling(boolean callForBulling) {
        this.callForBulling = callForBulling;
    }

    public boolean isCallForSuicide() {
        return callForSuicide;
    }

    public void setCallForSuicide(boolean callForSuicide) {
        this.callForSuicide = callForSuicide;
    }

    public boolean isAnimalAbuse() {
        return animalAbuse;
    }

    public void setAnimalAbuse(boolean animalAbuse) {
        this.animalAbuse = animalAbuse;
    }

    public boolean isMisleading() {
        return misleading;
    }

    public void setMisleading(boolean misleading) {
        this.misleading = misleading;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public boolean isExtremism() {
        return extremism;
    }

    public void setExtremism(boolean extremism) {
        this.extremism = extremism;
    }

    public boolean isHostileSpeech() {
        return hostileSpeech;
    }

    public void setHostileSpeech(boolean hostileSpeech) {
        this.hostileSpeech = hostileSpeech;
    }

    public boolean isUnoriginalContent() {
        return unoriginalContent;
    }

    public void setUnoriginalContent(boolean unoriginalContent) {
        this.unoriginalContent = unoriginalContent;
    }
}
