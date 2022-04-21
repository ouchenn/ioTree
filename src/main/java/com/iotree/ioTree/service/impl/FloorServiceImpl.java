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
    public House addFloor(Floor floor) {
        return null;
    }

    @Override
    public House getFloor(String id) {
        return null;
    }

    @Override
    public Floor updateFloor(Floor floor) {
        return null;
    }

    @Override
    public String deleteFloor(String id) {
        return null;
    }

    @Override
    public List<Floor> getAllFloors() {
        return null;
    }
}
