package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.Floor;
import com.iotree.ioTree.domain.House;

import java.util.List;

public interface IFloorService {

    House addFloor(Floor floor);

    House getFloor(String id);

    Floor updateFloor(Floor floor);

    String deleteFloor(String id);

    List<Floor> getAllFloors();
}
