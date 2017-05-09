package db.entity;

import java.util.Date;

/**
 * Created by Андрей on 02.04.2017.
 */
public class Views extends Entity{

    private int userId;
    private int objectId;
    private Date dateView;
    private String timeView;

    public Views() {
    }
    public Views(int userId, int objectId, Date dateView, String timeView) {
        this.userId = userId;
        this.objectId = objectId;
        this.dateView = dateView;
        this.timeView = timeView;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public Date getDateView() {
        return dateView;
    }

    public void setDateView(Date dateView) {
        this.dateView = dateView;
    }

    public String getTimeView() {
        return timeView;
    }

    public void setTimeView(String timeView) {
        this.timeView = timeView;
    }

    @Override
    public String toString() {
        return "Views{" +
                "userId=" + userId +
                ", objectId=" + objectId +
                ", dateView=" + dateView +
                ", timeView='" + timeView + '\'' +
                '}';
    }
}
