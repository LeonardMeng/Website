package org.mengsoft.webbackend.dao;

import org.apache.ibatis.annotations.Param;
import org.mengsoft.webbackend.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByUserId(Long userId);

    int insert(User user);

    int insertSelective(User user);

    User selectByUserId(Long userId);

    int updateByUserIdSelective(User user);

    int updateByUserId(User user);

    List<User> selectByPageSize(@Param("pageNum") int pageNum,
                                @Param("pageSize") int pageSize);
}