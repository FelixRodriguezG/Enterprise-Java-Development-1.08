package video.streaming.service.content;

import video.streaming.service.model.Video;
/**
 * Represents a movie in the video streaming service.
 * Inherits from the Video class.
 */
public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Rating: " + rating;
    }
}
