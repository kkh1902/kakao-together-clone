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
    private LocalDateTime endDate;
    private String mainCategory;
    private Double finalAmount;

    // Constructors, getters, and setters
    // ...

    // Additional fields for the properties you mentioned
    private String thumbnailImage; // For storing the thumbnail image file name or URL
    private String image; // For storing the main image file name or URL
    private String longText; // For storing the long text content

    // Additional getters and setters for the new fields
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLongText() {
        return longText;
    }

    public void setLongText(String longText) {
        this.longText = longText;
    }
}
