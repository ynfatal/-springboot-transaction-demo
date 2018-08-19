package com.fatal.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author: Fatal
 * @date: 2018/8/19 0019 21:02
 */
public interface AccountMapper {

    Integer update(@Param("money") Double money, @Param("id") Integer id);

}
