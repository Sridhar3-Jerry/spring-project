package com.sridhar.infinitystream.model;



import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
//import javax.persistence.*;

@Entity
@Table(name = "MovieDetails")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "movie_name", nullable = false)
    private String movieName;

    @Column(name = "movie_img", nullable = false)
    private String movieImg;

    @Column(name = "movie_alt")
    private String movieAlt;

    @Column(name = "poster_img", nullable = false)
    private String posterImg;

    @Column(name = "video_link", nullable = false)
    private String videoLink;

    @Column(name = "movie_genre")
    private String movieGenre;

    @Column(name = "description")
    private String description;

    @Column(name = "movie_hours", precision = 4, scale = 2)
    private String movieHours;

    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "languages")
    private String languages;

    @Column(name = "category")
    private String category;

    @Column(name = "movie_ratings", precision = 3, scale = 1)
    private BigDecimal movieRatings;

    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieImg() {
        return movieImg;
    }

    public void setMovieImg(String movieImg) {
        this.movieImg = movieImg;
    }

    public String getMovieAlt() {
        return movieAlt;
    }

    public void setMovieAlt(String movieAlt) {
        this.movieAlt = movieAlt;
    }

    public String getPosterImg() {
        return posterImg;
    }

    public void setPosterImg(String posterImg) {
        this.posterImg = posterImg;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovieHours() {
        return movieHours;
    }

    public void setMovieHours(String movieHours) {
        this.movieHours = movieHours;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getMovieRatings() {
        return movieRatings;
    }

    public void setMovieRatings(BigDecimal movieRatings) {
        this.movieRatings = movieRatings;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getMovieId() {
        return id;
    }

    public String getMovieCategory() {
        return category;
    }


//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private List<Review> reviews;
//
//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }
}
