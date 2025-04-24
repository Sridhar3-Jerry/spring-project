//package com.sridhar.infinitystream.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Data
//public class Review {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String comment;
//    private int rating;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id")
//    private Movie movie;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//}
