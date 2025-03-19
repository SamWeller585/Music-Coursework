import java.util.ArrayList;
import java.util.Iterator;


public class MusicLibrary {
    private ArrayList<Song> songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String title, String artist, long playCount) {
        songs.add(new Song(title, artist, playCount));
        System.out.println("Song added to library!");
    }

    public void removeSong(String title) {
        Iterator<Song> iterator = songs.iterator();
        while (iterator.hasNext()) {
          if (iterator.next().getTitle().equalsIgnoreCase(title)) {
            iterator.remove();
            System.out.println("Song removed successfully!");
            return;
          }
        }
        System.out.println("Song not found in library, Sorry!");
    }

    public void printAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the libary.");
        } else {
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    public void printSongsByPlayCount(int minPlays) {
        boolean found = false;
        for (Song song : songs) {
            if (song.getPlayCount() >= minPlays) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No songs found with play count >= " + minPlays);
        }
    }
}