package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int commentID;
    private boolean canPost;
    private String commentReply;
    private int commentReplyId;
    private String text;
    private LikeInfo likeInfo;
    private ReportInfo reportInfo;
    private boolean deleteComment;
    private boolean editComment;
    private int replyCommentCount;
    private String UserUrl;
    private RepostInfo repostInfo;
    private boolean groupCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
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

    public void setCommentReplyId(int commentReplyId) {
        this.commentReplyId = commentReplyId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public ReportInfo getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(ReportInfo reportInfo) {
        this.reportInfo = reportInfo;
    }

    public boolean isDeleteComment() {
        return deleteComment;
    }

    public void setDeleteComment(boolean deleteComment) {
        this.deleteComment = deleteComment;
    }

    public boolean isEditComment() {
        return editComment;
    }

    public void setEditComment(boolean editComment) {
        this.editComment = editComment;
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

    public void setUserUrl(String userUrl) {
        UserUrl = userUrl;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public boolean isGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(boolean groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
