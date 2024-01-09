
import pack.Song;

public class AppPack {
    public static void main(String[] args) {
        // Creating an instance of the Song class
        Song song = new Song("Sample Song", "Sample Artist", 180);

        // Playing the song
        song.play();

        // Displaying song details
        song.displayDetails();
    }
}
