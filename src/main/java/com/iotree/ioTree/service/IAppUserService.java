package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.AppUser;

import java.util.List;

public interface IAppUserService {

    AppUser createUser(AppUser user);

    List<AppUser> getAllUsers();

    AppUser getUser(String id);
}
