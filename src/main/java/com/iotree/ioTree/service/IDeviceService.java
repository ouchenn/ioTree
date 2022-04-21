package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.Device;

import java.util.List;

public interface IDeviceService {

    Device addDevice(Device device);

    Device getDevice(String id);

    Device updateDevice(Device device);

    String deleteDevice(String id);

    List<Device> getAllDevices();
}