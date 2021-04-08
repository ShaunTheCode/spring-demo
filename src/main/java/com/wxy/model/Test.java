package com.wxy.model;

import java.util.Date;

/**
*
* @author wxy 
* @date 2021/04/08 10:50
* @since 1.0
*/
public class Test {
    private Long id;

    private String name;

    private Date reportYearMonth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReportYearMonth() {
        return reportYearMonth;
    }

    public void setReportYearMonth(Date reportYearMonth) {
        this.reportYearMonth = reportYearMonth;
    }
}