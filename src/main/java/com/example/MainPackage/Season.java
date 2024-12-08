package Watchit;

import java.util.List;

public class Season {
    private int numberOfSeasons;
    private List<Episode> episodes;

    public Season (int numberOfSeasons, List<Episode> episode) {
        this.numberOfSeasons = numberOfSeasons;
        this.episodes = episode;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }
}
