package com.iotree.ioTree.service.impl;

import com.iotree.ioTree.domain.House;
import com.iotree.ioTree.repository.HouseRepository;
import com.iotree.ioTree.service.IHouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class HouseServiceImpl implements IHouseService {

    @Autowired
    private HouseRepository houseRepo;

    @Override
    public House addHouse(House house) {
        return null;
    }

    @Override
    public House getHouse(String id) {
        return null;
    }

    @Override
    public House updateHouse(House house) {
        return null;
    }

    @Override
    public String deleteHouse(String id) {
        return null;
    }

    @Override
    public List<House> getAllHouses() {
        return null;
    }
}
