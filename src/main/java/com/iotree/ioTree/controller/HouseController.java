package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.AppUser;
import com.iotree.ioTree.domain.House;
import com.iotree.ioTree.service.impl.AppUserServiceImpl;
import com.iotree.ioTree.service.impl.HouseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/house")
public class HouseController {

    @Autowired
    private HouseServiceImpl houseService;

    @PostMapping()
    public House addHouse(@RequestBody House house){
        return houseService.addHouse(house);
    }

    @GetMapping("/{id}")
    public House findHouse(@PathVariable String id){
        return houseService.getHouse(id);
    }

    @PutMapping()
    public House updateHouse(@RequestBody House house){
        return houseService.updateHouse(house);
    }

    @DeleteMapping("/{id}")
    public String deleteHouse(@PathVariable String id){
        return houseService.deleteHouse(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<House>> All(){
        return ResponseEntity.ok(houseService.getAllHouses());
    }
}
