package com.tian.tkmapper.tk.dao;

import com.tian.tkmapper.MyMapper;
import com.tian.tkmapper.tk.bean.User;
import org.springframework.stereotype.Repository;

/**
 * userDao
 *
 * @author cui
 * @create 2018-09-12 13:35
 **/
@Repository
public interface UserDao extends MyMapper<User> {
}
