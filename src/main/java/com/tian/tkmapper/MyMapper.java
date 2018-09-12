package com.tian.tkmapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * baseMapper
 *
 * @author cui
 * @create 2018-09-12 13:36
 **/
@Repository
public interface MyMapper<T> extends Mapper<T> ,MySqlMapper<T> {
}
