package com.iotree.ioTree.repository;

import com.iotree.ioTree.domain.Floor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends MongoRepository<Floor, String> {
}