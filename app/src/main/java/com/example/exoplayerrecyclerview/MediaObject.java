package com.example.exoplayerrecyclerview;

public class MediaObject {

    private int uId;
    private String title;
    private String mediaUrl;
    private String mediaCoverImgUrl;
    private String userHandle;

    public int getuId() {
        return uId;
    }

    public void setId(int uId) {
        this.uId = uId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMediaCoverImgUrl() {
        return mediaCoverImgUrl;
    }

    public void setCoverUrl(String mediaCoverImgUrl) {
        this.mediaCoverImgUrl = mediaCoverImgUrl;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }
}
