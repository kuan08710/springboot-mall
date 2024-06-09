package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.UserLoginRequest;
import com.louis.springbootmall.dto.UserRegisterRequest;
import com.louis.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);

}
