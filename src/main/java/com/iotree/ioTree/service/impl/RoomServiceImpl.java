package com.iotree.ioTree.service.impl;

import com.iotree.ioTree.domain.Room;
import com.iotree.ioTree.repository.RoomRepository;
import com.iotree.ioTree.service.IRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RoomServiceImpl implements IRoomService {

    @Autowired
    private RoomRepository roomRepo;

    @Override
    public Room addRoom(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public Room getRoom(String id) {
        return roomRepo.findById(id).orElse(null);
    }

    @Override
    public Room updateRoom(Room room) {
        Room getRoom = roomRepo.findById(room.getId()).orElse(null);
        if(getRoom != null){
            roomRepo.save(room);
        }
        return room;
    }

    @Override
    public String deleteRoom(String id) {
        roomRepo.deleteById(id);
        return "Room deleted successfully!";
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepo.findAll();
    }
}
