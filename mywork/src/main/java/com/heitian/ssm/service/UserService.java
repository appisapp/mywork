package com.heitian.ssm.service;
import  com.heitian.ssm.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
