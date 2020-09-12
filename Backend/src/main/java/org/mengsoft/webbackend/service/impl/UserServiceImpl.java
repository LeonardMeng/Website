package org.mengsoft.webbackend.service.impl;

import org.apache.ibatis.annotations.Param;
import org.mengsoft.webbackend.dao.UserMapper;
import org.mengsoft.webbackend.model.User;
import org.mengsoft.webbackend.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User GetUserById(Long userId) {
        return userMapper.selectByUserId(userId);
    }

    @Override
    public List<User> GetUserByPageSize(){
        return userMapper.selectByPageSize();
    }

}
