package com.ycl.dao;

import com.ycl.domain.User;

import java.util.List;

/**
 * 用户持久层
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
