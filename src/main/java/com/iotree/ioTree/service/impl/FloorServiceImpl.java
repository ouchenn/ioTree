package com.iotree.ioTree.service.impl;

import com.iotree.ioTree.domain.Floor;
import com.iotree.ioTree.domain.House;
import com.iotree.ioTree.repository.FloorRepository;
import com.iotree.ioTree.service.IFloorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FloorServiceImpl implements IFloorService {

    @Autowired
    private FloorRepository floorRepo;

    @Override
    public Floor addFloor(Floor floor) {
        return floorRepo.save(floor);
    }

    @Override
    public Floor getFloor(String id) {
        return floorRepo.findById(id).orElse(null);
    }

    @Override
    public Floor updateFloor(Floor floor) {
        Floor getFloor = floorRepo.findById(floor.getId()).orElse(null);
        if(getFloor != null){
            floorRepo.save(floor);
        }
        return floor;
    }

    @Override
    public String deleteFloor(String id) {
        floorRepo.deleteById(id);
        return "Floor deleted successfully!";
    }

    @Override
    public List<Floor> getAllFloors() {
        return floorRepo.findAll();
    }
}
