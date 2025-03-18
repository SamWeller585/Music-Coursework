public class Song {
    private String title;
    private String artist;
    private int playCount;

public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
    this.playCount = 0; // Initialize playCount to a default value
}

public String getTitle() {
    return title;
}

public String getArtist() {
    return artist;
}

public int getPlayCount() {
    return playCount;
}

@Override
public String toString() {
    return "Title: " + title + " Artist: " + artist + " Play Count: " + playCount;
    }
}
