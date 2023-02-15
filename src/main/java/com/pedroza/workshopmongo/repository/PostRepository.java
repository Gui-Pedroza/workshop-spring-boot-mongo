package com.pedroza.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pedroza.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
