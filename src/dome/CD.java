package dome;

import java.sql.Time;

public class CD extends Item {

    private String artist;
    private int numofTracks;


    public CD(String title, Time playingTime, boolean gotIt, String comment, String artist, int numofTracks) {
        super(title, playingTime, gotIt, comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    public static void main(String[] args){

    }

    public void print() {
        /**
         *  System.out.print("标题："+getTitle()+"\n"
         *         +"艺术家："+artist+"\n"+
         *         "播放时间："+getPlayingTime()+"\n");
         */
        System.out.print("CD:");
        super.print();
        System.out.print(artist);
    }
}
