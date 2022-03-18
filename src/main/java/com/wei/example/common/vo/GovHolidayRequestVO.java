package com.wei.example.common.vo;

public class GovHolidayRequestVO {
    private Integer year;

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "GovHolidayRequestVO{" +
                "year='" + year + '\'' +
                '}';
    }
}
