package dome;

import java.sql.Time;

public class Item {

    private String title;
    private Time playingTime;
    private boolean gotIt;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(Time playingTime) {
        this.playingTime = playingTime;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Item(String title, Time playingTime, boolean gotIt, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }


    public void print() {
        System.out.println(title);
    }
}
