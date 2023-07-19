package com.gachi.together.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String subTopic;
    private String topic;
    private String title;
    private String category;
    private String author;
    private String paragraph;
    private String amount;
    private Double targetAmount;
    private LocalDateTime createdDate;
    private String thumbnail;
    private String bodyTopic1;
    private String text;
    private String imageSrc;
    private String videoLink;
    private String tag1;
    private String tag2;
    private String tag3;
    private LocalDateTime endDate;
    private String mainCategory;
    private Double finalAmount;

    // Constructors, getters, and setters
    // ...

}
