package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.Device;
import com.iotree.ioTree.service.impl.DeviceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/device")
public class DeviceController {

    @Autowired
    private DeviceServiceImpl deviceService;

    @PostMapping()
    public Device add(@RequestBody Device device){
        return deviceService.addDevice(device);
    }

    @GetMapping("/{id}")
    public Device findDevice(@PathVariable String id){
        return deviceService.getDevice(id);
    }

    @PutMapping()
    public Device update(@RequestBody Device device){
        return deviceService.updateDevice(device);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return deviceService.deleteDevice(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Device>> findAll(){
        return ResponseEntity.ok(deviceService.getAllDevices());
    }
}