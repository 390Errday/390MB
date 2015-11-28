package com.ryanarifswana.bioflix.database.model;

/**
 * Created by ariftopcu on 11/27/15.
 */
public class Session {
    private String id;
    private String movieName;
    private String viewerName;
    private int startTime;
    private int endTime;
    private boolean complete;

    public Session() {
        complete = false;
    }

    public String getId() {
        return id;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getViewerName() {
        return viewerName;
    }
    public int getStartTime() {
        return startTime;
    }
    public int getEndTime() {
        return endTime;
    }

    public boolean isComplete(){
        return complete;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
