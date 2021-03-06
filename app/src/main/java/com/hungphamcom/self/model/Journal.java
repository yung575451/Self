package com.hungphamcom.self.model;

import com.google.firebase.Timestamp;

public class Journal {
    private String title;
    private String thought;
    private String imageUrl;
    private String UserId;
    private Timestamp timeAdded;
    private String username;

    public Journal(String title, String thought, String imageUrl, String userId, Timestamp timeAdded, String username) {
        this.title = title;
        this.thought = thought;
        this.imageUrl = imageUrl;
        this.UserId = userId;
        this.timeAdded = timeAdded;
        this.username = username;
    }

    public Journal() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public Timestamp getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Timestamp timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
