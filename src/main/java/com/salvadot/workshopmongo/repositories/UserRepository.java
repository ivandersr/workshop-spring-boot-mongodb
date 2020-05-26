package com.salvadot.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.salvadot.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
