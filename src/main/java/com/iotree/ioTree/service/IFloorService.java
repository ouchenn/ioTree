package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.Floor;
import com.iotree.ioTree.domain.House;

import java.util.List;

public interface IFloorService {

    Floor addFloor(Floor floor);

    Floor getFloor(String id);

    Floor updateFloor(Floor floor);

    String deleteFloor(String id);

    List<Floor> getAllFloors();
}
