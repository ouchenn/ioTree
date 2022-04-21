package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.Room;

import java.util.List;

public interface IRoomService {

    Room addRoom(Room room);

    Room getRoom(String id);

    Room updateRoom(Room room);

    String deleteRoom(String id);

    List<Room> getAllRooms();
}
