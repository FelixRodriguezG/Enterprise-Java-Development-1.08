package video.streaming.service;

import video.streaming.service.content.Movie;
import video.streaming.service.content.TvSeries;

// This is a placeholder for the main class of the video streaming service application.
public class Main {
    public static void main(String[] args) {
        // Create a movie instance
        // This class serves as the entry point for the video streaming service application.
        System.out.println("=========================================================");
        System.out.println("++++ 🎬 Welcome to the Video Streaming Service! 🍿 +++++");
        System.out.println("=========================================================");
        Movie movie = new Movie("Inception", 148, 8.8);
        // Print information about the movie

        System.out.println(movie.getInfo());

        // Create a TV series instance
        TvSeries tvSeries = new TvSeries("Breaking Bad", 47, 62);
        System.out.println(tvSeries.getInfo());
        System.out.println("---------------------------------------------------------");
    }
}
