
package pack;

public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public void displayDetails() {
        System.out.println("Title: " + title + "\nArtist: " + artist + "\nDuration: " + duration + " seconds");
    }
}
