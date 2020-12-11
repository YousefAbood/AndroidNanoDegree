package com.example.android.news;

import android.media.Image;

import java.net.URL;
import java.util.Date;


public class Post {

    private String author;
    private String category;
    private String description;
    private String id;
    private Image image;
    private String language;
    private Date published;
    private String title;
    private URL url;

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public String getLanguage() {
        return language;
    }

    public Date getPublished() {
        return published;
    }

    public String getTitle() {
        return title;
    }

    public URL getUrl() {
        return url;
    }
}
