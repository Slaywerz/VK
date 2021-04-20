package ru.netology.domain;

public class Post {
    private int postID;
    private String date;
    private int ownerID;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String text;
    private CommentsInfo commentsInfo;
    private LikeInfo likeInfo;
    private int replyCount;
    private int viewsCount;
    private boolean deletePost;
    private boolean editPost;
    private ReportInfo reportInfo;
    private boolean saveBookmark;
    private Copyright copyright;
    private String postType;
    private PostSource postSource;
    private GeoInfo geoInfo;
    private int signerId;
    private boolean canPin;
    private boolean PinnedPost;
    private boolean markedAd;
    private DonutInfo donutInfo;
    private int postponedId;

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
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

    public boolean isSaveBookmark() {
        return saveBookmark;
    }

    public void setSaveBookmark(boolean saveBookmark) {
        this.saveBookmark = saveBookmark;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isPinnedPost() {
        return PinnedPost;
    }

    public void setPinnedPost(boolean pinnedPost) {
        PinnedPost = pinnedPost;
    }

    public boolean isMarkedAd() {
        return markedAd;
    }

    public void setMarkedAd(boolean markedAd) {
        this.markedAd = markedAd;
    }

    public DonutInfo getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(DonutInfo donutInfo) {
        this.donutInfo = donutInfo;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
