package com.jas.controller;

import com.jas.model.Community;
import com.jas.repository.CommunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/communities")
public class CommunityController {

    @Autowired
    private CommunityRepository communityRepository;

    @PostMapping
    public ResponseEntity<Community> create(@RequestBody Community community) {
        return ResponseEntity.ok(communityRepository.save(community));
    }

    @GetMapping
    public List<Community> getAll() {
        return communityRepository.findAll();
    }
}
