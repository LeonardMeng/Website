package org.mengsoft.webbackend.service;

import org.apache.ibatis.annotations.Param;
import org.mengsoft.webbackend.dao.UserMapper;
import org.mengsoft.webbackend.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User GetUserById(Long userId) {
        return userMapper.selectByUserId(userId);
    }


    public List<User> GetUserByPageSize(){
        return userMapper.selectByPageSize(1, 10);
    }

}
