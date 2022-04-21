package com.iotree.ioTree.service.impl;

import com.iotree.ioTree.domain.AppUser;
import com.iotree.ioTree.repository.AppUserRepository;
import com.iotree.ioTree.service.IAppUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AppUserServiceImpl implements IAppUserService {

    @Autowired
    private AppUserRepository userRepo;

    @Override
    public AppUser createUser(AppUser user) {
        return null;
    }

    @Override
    public List<AppUser> getAllUsers() {
        return null;
    }

    @Override
    public AppUser getUser(String id) {
        return null;
    }
}
