/*
 * Author Name: Aditya Chaurasia
 * Date: 17-09-2022
 * Created With: IntelliJ IDEA Community Edition
 * Profile: github.com/ChaurasiaAditya
 */
package tasks.task4.code;

import java.math.BigInteger;
import java.util.Objects;

public class YouTubeVideo implements Comparable<YouTubeVideo>{
    private final long videoId;
    private final String nameOfTheVideo;
    private BigInteger numberOfLikes;
    private int videoInMinutes;

    public YouTubeVideo(long videoId, String nameOfTheVideo, BigInteger numberOfLikes, int videoInMinutes) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YouTubeVideo that = (YouTubeVideo) o;
        return videoId == that.videoId && videoInMinutes == that.videoInMinutes && Objects.equals(nameOfTheVideo, that.nameOfTheVideo) && Objects.equals(numberOfLikes, that.numberOfLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, nameOfTheVideo, numberOfLikes, videoInMinutes);
    }

    @Override
    public String toString() {
        return "YouTubeVideos{" +
                "videoId=" + videoId +
                ", nameOfTheVideo='" + nameOfTheVideo + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", videoInMinutes=" + videoInMinutes +
                '}';
    }

    @Override
    public int compareTo(YouTubeVideo o) {
        return 0;
    }
}
