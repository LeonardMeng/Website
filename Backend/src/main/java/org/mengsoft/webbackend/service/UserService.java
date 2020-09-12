package org.mengsoft.webbackend.service;

import org.mengsoft.webbackend.model.User;

import java.util.List;

public interface UserService {

    public User GetUserById(Long userId);

    public List<User> GetUserByPageSize();
}
