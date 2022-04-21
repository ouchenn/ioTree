package com.iotree.ioTree.repository;

import com.iotree.ioTree.domain.House;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends MongoRepository<House, String> {
}