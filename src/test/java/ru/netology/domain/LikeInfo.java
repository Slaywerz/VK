package ru.netology.domain;

public class LikeInfo {
    private int likeCount;
    private String likeUserUrl;

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getLikeUserUrl() {
        return likeUserUrl;
    }

    public void setLikeUserUrl(String likeUserUrl) {
        this.likeUserUrl = likeUserUrl;
    }
}
