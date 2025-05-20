package com.jas.controller;

import com.jas.model.Post;
import com.jas.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return ResponseEntity.ok(postRepository.save(post));
    }

    @GetMapping("/community/{communityId}")
    public ResponseEntity<List<Post>> getPostsByCommunity(@PathVariable String communityId) {
        return ResponseEntity.ok(postRepository.findByCommunityId(communityId));
    }
}
