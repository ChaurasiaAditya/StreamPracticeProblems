/*
 * Author Name: Aditya Chaurasia
 * Date: 17-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task4.code;

import java.math.BigInteger;

public class YouTubeVideos {
    private final long videoId;
    private final String nameOfTheVideo;
    private BigInteger numberOfLikes;
    private int videoInMinutes;

    public YouTubeVideos(long videoId, String nameOfTheVideo, BigInteger numberOfLikes, int videoInMinutes) {
        this.videoId = videoId;
        this.nameOfTheVideo = nameOfTheVideo;
        this.numberOfLikes = numberOfLikes;
        this.videoInMinutes = videoInMinutes;
    }

    public long getVideoId() {
        return videoId;
    }

    public String getNameOfTheVideo() {
        return nameOfTheVideo;
    }

    public BigInteger getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(BigInteger numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getVideoInMinutes() {
        return videoInMinutes;
    }

    public void setVideoInMinutes(int videoInMinutes) {
        this.videoInMinutes = videoInMinutes;
    }
}
