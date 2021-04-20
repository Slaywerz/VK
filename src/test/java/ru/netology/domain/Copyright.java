package ru.netology.domain;

public class Copyright {
    private int id;
    private String copyRightUrl;
    private String name;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCopyRightUrl() {
        return copyRightUrl;
    }

    public void setCopyRightUrl(String copyRightUrl) {
        this.copyRightUrl = copyRightUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
