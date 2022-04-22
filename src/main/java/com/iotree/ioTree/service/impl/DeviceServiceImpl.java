package com.iotree.ioTree.service.impl;

import com.iotree.ioTree.domain.Device;
import com.iotree.ioTree.repository.DeviceRepository;
import com.iotree.ioTree.service.IDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private DeviceRepository deviceRepo;

    @Override
    public Device addDevice(Device device) {
        return deviceRepo.save(device);
    }

    @Override
    public Device getDevice(String id) {
        return deviceRepo.findById(id).orElse(null);
    }

    @Override
    public Device updateDevice(Device device) {
        Device getDevice = deviceRepo.findById(device.getId()).orElse(null);
        if(getDevice != null){
            deviceRepo.save(device);
        }
        return device;
    }

    @Override
    public String deleteDevice(String id) {
        deviceRepo.deleteById(id);
        return "Device deleted successfully!";
    }

    @Override
    public List<Device> getAllDevices() {
        return deviceRepo.findAll();
    }
}
