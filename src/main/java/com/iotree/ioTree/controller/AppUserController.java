package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.AppUser;
import com.iotree.ioTree.service.impl.AppUserServiceImpl;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class AppUserController {

    @Autowired
    private AppUserServiceImpl appUserService;

    @PostMapping()
    public AppUser add(@RequestBody AppUser user) {
        return appUserService.createUser(user);
    }

    @GetMapping("/{id}")
    public AppUser get(@PathVariable String id) {
        return appUserService.getUser(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AppUser>> getAll() {
        List<AppUser> users = appUserService.getAllUsers();
        return  ResponseEntity.ok(users);
    }
}