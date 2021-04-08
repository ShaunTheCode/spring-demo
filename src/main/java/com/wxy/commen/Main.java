package com.wxy.commen;

import com.wxy.service.TransactionDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author wxy
 * @date 2021/04/08 10:55
 * @since 1.0
 */
public class Main
{
    @Autowired
    private TransactionDemoService demoService;

    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TransactionDemoService demoService = (TransactionDemoService) context.getBean("transactionDemoService");
        demoService.insert();
    }
}
