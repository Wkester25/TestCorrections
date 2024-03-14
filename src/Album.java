import java.util.ArrayList;

public class Album implements Comparable<Album> {
    private String title;
    private String artist;
    private ArrayList<Song> tracks;
    private String genre;
    private double playingTime;

    /**
     * Constructor for Album
     * @param t
     * @param a
     * @param tr
     * @param g
     * @param pt
     */
    public Album(String t, String a, ArrayList<Song> tr, String g, double pt) {
        title = t;
        artist = a;
        tracks = tr;
        genre = g;
        playingTime = pt;
    }

    /**
     * Default Constructor for Album
     */
    public Album(){
        title = "";
        artist = "";
        tracks = new ArrayList<Song>();
        genre = "";
        playingTime = 0.0;
    }

    /**
     * Set the title of the album
     * @param t
     */
    public void setTitle(String t) {
        title = t;
    }

    /**
     * Get the playing time of the album
     * @return
     */
    public double getPlayingTime() {
        return playingTime;
    }

    /**
     * Copy Constructor for Album
     * @param a
     */
    public Album(Album a) {
        title = a.title;
        artist = a.artist;
        tracks = new ArrayList<Song>(a.tracks);
        genre = a.genre;
        playingTime = a.playingTime;
    }

    /**
     * Converts album to string
     * @return
     */
    public String toString() {
        return "Title: " + title + " Artist: " + artist + " Tracks: " + tracks + " Genre: " + genre + " Playing Time: " + playingTime;
    }

    /**
     * checks if 2 albums are equal
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        Album a = (Album) o;
        return title.equalsIgnoreCase(a.title) && artist.equalsIgnoreCase(a.artist);
    }

    /**
     * Compares 2 albums based on playing time
     * @param o
     * @return
     */
    public int compareTo(Album o) {
        return (int) (playingTime - o.playingTime);
    }

    /**
     * Updates the playing time of the album based on the songs
     */
    public void updatePlayingTime() {
        playingTime = 0;
        for (Song s : tracks) {
            playingTime += s.getDuration();
        }
    }

}