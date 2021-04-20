package ru.netology.domain;

public class GeoInfo {
    private String geoType;
    private String geoCoordinates;
    private Object geoPlace;

    public String getGeoType() {
        return geoType;
    }

    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    public String getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(String geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public Object getGeoPlace() {
        return geoPlace;
    }

    public void setGeoPlace(Object geoPlace) {
        this.geoPlace = geoPlace;
    }
}
