package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.House;

import java.util.List;

public interface IHouseService {

    House addHouse(House house);

    House getHouse(String id);

    House updateHouse(House house);

    String deleteHouse(String id);

    List<House> getAllHouses();
}
