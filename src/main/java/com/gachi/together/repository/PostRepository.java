package com.gachi.together.repository;

import com.gachi.together.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Add custom query methods here if needed
}
