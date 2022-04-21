package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.Floor;
import com.iotree.ioTree.service.impl.FloorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/floor")
public class FloorController {

    @Autowired
    private FloorServiceImpl floorService;

    @PostMapping()
    public Floor add(@RequestBody Floor floor){
        return floorService.addFloor(floor);
    }

    @GetMapping("/{id}")
    public Floor findFloor(@PathVariable String id){
        return floorService.getFloor(id);
    }

    @PutMapping()
    public Floor update(@RequestBody Floor floor){
        return floorService.updateFloor(floor);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return floorService.deleteFloor(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Floor>> findAll(){
        return ResponseEntity.ok(floorService.getAllFloors());
    }
}