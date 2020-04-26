package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 修改密码
     * @param password
     * @param userId
     */
    public int  updatePwd(@Param("password")String password,@Param("userId")Integer userId);

    /**
     * 用户登录验证
     * @param user
     * @return User
     */
    public User getUserByPwd(User user);

    /**
     * 添加用户
     * @param user
     * @return User
     */
    public  void addUser(User user);
}
