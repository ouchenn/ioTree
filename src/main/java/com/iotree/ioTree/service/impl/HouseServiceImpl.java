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
        return houseRepo.save(house);
    }

    @Override
    public House getHouse(String id) {
        return houseRepo.findById(id).orElse(null);
    }

    @Override
    public House updateHouse(House house) {
        House getHouse = houseRepo.findById(house.getId()).orElse(null);
        if(getHouse != null){
            houseRepo.save(house);
        }
        return house;
    }

    @Override
    public String deleteHouse(String id) {
        houseRepo.deleteById(id);
        return "House deleted successfully!";
    }

    @Override
    public List<House> getAllHouses() {
        return houseRepo.findAll();
    }
}
