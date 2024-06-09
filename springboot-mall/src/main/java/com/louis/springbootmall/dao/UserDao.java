package com.louis.springbootmall.dao;

import com.louis.springbootmall.dto.UserRegisterRequest;
import com.louis.springbootmall.model.User;

public interface UserDao {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
