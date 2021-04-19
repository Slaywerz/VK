package ru.netology.domain;

public class Post {
    private int postID;
    private String date;
    private int ownerID;
    private String imageURL;
    private String text;
    private CommentsInfo commentsInfo;
    private LikeInfo likeInfo;
    private int replyCount;
    private int viewsCount;
    private boolean deletePost;
    private boolean editPost;
    private ReportInfo reportInfo;

    public int getPostID() {
        return postID;
    }

    public String getDate() {
        return date;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public boolean isDeletePost() {
        return deletePost;
    }

    public void setDeletePost(boolean deletePost) {
        this.deletePost = deletePost;
    }

    public boolean isEditPost() {
        return editPost;
    }

    public void setEditPost(boolean editPost) {
        this.editPost = editPost;
    }

    public ReportInfo getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(ReportInfo reportInfo) {
        this.reportInfo = reportInfo;
    }
}
