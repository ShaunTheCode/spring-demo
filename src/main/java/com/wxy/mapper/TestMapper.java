package com.wxy.mapper;

import com.wxy.model.Test;

/**
*
* @author wxy 
* @date 2021/04/08 10:50
* @since 1.0
*/
public interface TestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}