package com.sridhar.infinitystream.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "wish_list")
@Data
@Component
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "movie_category")
    private String movieCategory;

}
