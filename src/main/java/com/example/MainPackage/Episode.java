package Watchit;

public class Episode {
    private int episodeNumber;
    private String title;
    private int duration;
    private String description;

    public Episode(int episodeNumber, String title, int duration, String description) {
        this.episodeNumber = episodeNumber;
        this.description = description;
        this.title=title;
        this.duration=duration;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String CalcDuration() {
        int hrs = duration / 60;
        int min = duration % 60;

        if (hrs != 0) {
            return hrs + " hrs " + min + " min";
        } else {
            return min + " min";
        }
    }
}
