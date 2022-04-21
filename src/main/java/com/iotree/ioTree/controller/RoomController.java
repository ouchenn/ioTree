package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.Room;
import com.iotree.ioTree.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    private RoomServiceImpl roomService;

    @PostMapping()
    public Room add(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping("/{id}")
    public Room findRoom(@PathVariable String id){
        return roomService.getRoom(id);
    }

    @PutMapping()
    public Room update(@RequestBody Room room){
        return roomService.updateRoom(room);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return roomService.deleteRoom(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Room>> findAll(){
        return ResponseEntity.ok(roomService.getAllRooms());
    }
}