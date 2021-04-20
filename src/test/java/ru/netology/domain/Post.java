package ru.netology.domain;

public class Post {
    private int postID;
    private String date;
    private int ownerID;
    private String attachmentUrl;
    private String text;
    private CommentsInfo commentsInfo;
    private LikeInfo likeInfo;
    private int replyCount;
    private int viewsCount;
    private boolean deletePost;
    private boolean editPost;
    private ReportInfo reportInfo;
    private boolean saveBookmark;

    public int getPostID() {
        return postID;
    }

    public String getDate() {
        return date;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
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

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
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

    public void setDeletePost(boolean deletePost) {
        this.deletePost = deletePost;
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

    public boolean isSaveBookmark() {
        return saveBookmark;
    }

    public void setSaveBookmark(boolean saveBookmark) {
        this.saveBookmark = saveBookmark;
    }
}
