package com.jas.repository;

import com.jas.model.Community;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommunityRepository extends MongoRepository<Community, String> {
}
