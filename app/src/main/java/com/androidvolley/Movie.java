package com.androidvolley;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xiaoyun on 17-5-9.
 */

public class Movie {
    private int id;
    private String name;
    @SerializedName("time")
    private String publishTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishTime='" + publishTime + '\'' +
                '}';
    }
}
