package com.cos.retrofit2ex01;

import android.graphics.Movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Data;


@Data
public class Yts {
    private String status;
    private String statusMessage;
    private Data data;
    private Meta meta;

    @lombok.Data
    public class Data {
        private Integer movieCount;
        private Integer limit;
        private Integer pageNumber;
        private List<Movie> movies = null;

        @lombok.Data
        public class Movie {
            private Integer id;
            private String url;
            private String imdbCode;
            private String title;
            private String titleEnglish;
            private String titleLong;
            private String slug;
            private Integer year;
            private Double rating;
            private Integer runtime;
            private List<String> genres = null;
            private String summary;
            private String descriptionFull;
            private String synopsis;
            private String ytTrailerCode;
            private String language;
            private String mpaRating;
            private String backgroundImage;
            private String backgroundImageOriginal;
            private String smallCoverImage;
            private String mediumCoverImage;
            private String largeCoverImage;
            private String state;
            private List<Torrent> torrents = null;
            private String dateUploaded;
            private Integer dateUploadedUnix;
        }
    }

    @lombok.Data
    public class Meta {
        private Integer serverTime;
        private String serverTimezone;
        private Integer apiVersion;
        private String executionTime;
    }
    
    @lombok.Data
    public class Torrent {
        private String url;
        private String hash;
        private String quality;
        private String type;
        private Integer seeds;
        private Integer peers;
        private String size;
        private Integer sizeBytes;
        private String dateUploaded;
        private Integer dateUploadedUnix;
    }
}