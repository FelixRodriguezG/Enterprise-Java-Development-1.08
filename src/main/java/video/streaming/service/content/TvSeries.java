package video.streaming.service.content;

import video.streaming.service.model.Video;
/**
 * Represents a TV series in the video streaming service.
 * Inherits from the Video class.
 */
public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Episodes: " + episodes;
    }
}
