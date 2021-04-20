package ru.netology.domain;

public class LikeInfo {
    private int likeCount;
    private String likeUserUrl;
    private boolean canLike;
    private boolean canPublish;

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

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}

