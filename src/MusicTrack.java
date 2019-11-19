public class MusicTrack implements Comparable<MusicTrack>{
    private String title;
    private String artist;
    private double duration;
    private int rating;

    public MusicTrack(String title, String artist, double duration, int rating) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rating = rating;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(MusicTrack o) {
        return this.title.compareTo(o.title);
    }

    public String toString() {
        return "Title: "+this.title+
                "\nArtist: "+this.artist+
                "\nDuration: "+this.duration+
                "\nRating: "+this.rating;
    }
}
