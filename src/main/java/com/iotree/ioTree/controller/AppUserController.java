package com.iotree.ioTree.controller;

import com.iotree.ioTree.domain.AppUser;
import com.iotree.ioTree.service.impl.AppUserServiceImpl;
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
    public AppUser addUser(@RequestBody AppUser user) {
        return appUserService.createUser(user);
    }

    @GetMapping("/{id}")
    public AppUser findUser(@PathVariable String id) {
        return appUserService.getUser(id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AppUser>> findAll() {
        List<AppUser> users = appUserService.getAllUsers();
        return  ResponseEntity.ok(users);
    }
}
