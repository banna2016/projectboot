package com.wf.projectboot.user.service.impl;

import com.wf.projectboot.user.dao.UserMapper;
import com.wf.projectboot.user.model.User;
import com.wf.projectboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @param: $param$
 * @return: $return$
 * @Auther: banna
 * @Date: 2018/5/22 14:00
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
