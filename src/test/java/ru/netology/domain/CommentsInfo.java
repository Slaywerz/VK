package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int commentID;
    private boolean canPost;
    private String commentReply;
    private int commentReplyId;
    private Textinfo textInfo;
    private LikeInfo likeInfo;
    private ReportInfo reportInfo;
    private boolean deleteComment;
    private boolean editComment;
    private int replyCommentCount;
    private String UserUrl;
    private RepostInfo repostInfo;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCommentID() {
        return commentID;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getCommentReply() {
        return commentReply;
    }

    public void setCommentReply(String commentReply) {
        this.commentReply = commentReply;
    }

    public int getCommentReplyId() {
        return commentReplyId;
    }

    public Textinfo getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(Textinfo textInfo) {
        this.textInfo = textInfo;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public void setReportInfo(ReportInfo reportInfo) {
        this.reportInfo = reportInfo;
    }

    public boolean isDeleteComment() {
        return deleteComment;
    }

    public boolean isEditComment() {
        return editComment;
    }

    public int getReplyCommentCount() {
        return replyCommentCount;
    }

    public void setReplyCommentCount(int replyCommentCount) {
        this.replyCommentCount = replyCommentCount;
    }

    public String getUserUrl() {
        return UserUrl;
    }
}
