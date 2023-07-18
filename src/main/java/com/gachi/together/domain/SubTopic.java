package com.gachi.together.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "subtopics")
@Getter
@Setter
public class SubTopic {
    @Id
    private String code;
    private String keyword;

    // Constructors, getters, and setters
    // ...

}
