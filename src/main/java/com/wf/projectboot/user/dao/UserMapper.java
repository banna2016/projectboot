package com.wf.projectboot.user.dao;

import com.wf.projectboot.user.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @param: $param$
 * @return: $return$
 * @Auther: banna
 * @Date: 2018/5/22 10:37
 * @Description:
 */
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
