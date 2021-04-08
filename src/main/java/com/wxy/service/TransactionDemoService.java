package com.wxy.service;

import com.wxy.mapper.TestMapper;
import com.wxy.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author wxy
 * @date 2021/04/08 10:37
 * @since 1.0
 */
@Service
public class TransactionDemoService
{
    @Autowired
    private TestMapper testMapper;



    public void insert(){
        Test test=new Test();
        test.setId(UUID.randomUUID().getLeastSignificantBits());
        test.setName("test");
        test.setReportYearMonth(new Date());
        testMapper.insert(test);
        exception();
    }

    @Transactional
    public void exception(){
        Test test=new Test();
        test.setId(UUID.randomUUID().getLeastSignificantBits());
        test.setName("test2");
        test.setReportYearMonth(new Date());
        testMapper.insert(test);
        throw new RuntimeException();
    }
}
