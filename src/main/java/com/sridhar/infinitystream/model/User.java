package com.sridhar.infinitystream.model;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name="Users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column (name = "user_name", nullable=false)
    private String userName;


    @Column (name="user_mail", nullable=false)
    private String userMail;

    @Column (name="user_age", nullable=false)
    private int userAge;

    @Column (name="user_password", nullable = false)
    private String userPassword;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return user_id;
    }


//    public List<Wishlist> getWishlist() {
//        return wishlist;
//    }
//
//    public void setWishlist(List<Wishlist> wishlist) {
//        this.wishlist = wishlist;
//    }
//
//    @OneToMany(mappedBy = "user")
//    private List<Wishlist> wishlist;



//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
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
