package com.iotree.ioTree.service;

import com.iotree.ioTree.domain.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IAppUserService extends UserDetailsService {

    AppUser createUser(AppUser user);

    List<AppUser> getAllUsers();

    AppUser getUser(String id);
}
