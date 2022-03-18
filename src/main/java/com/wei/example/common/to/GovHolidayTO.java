package com.wei.example.common.to;

public class GovHolidayTO {
    private String date;
    private String name;
    private String isHoliday;
    private String holidayCategory;
    private String description;

    /**
     * ##  Data format ##
     *
     * "date": "2013/10/10",,
     * "name": "國慶日",
     * "isHoliday": "是",
     * "holidayCategory": "放假之紀念日及節日",
     * "description": "全國各機關學校放假一日。"
     *
     * "date": "2013/10/12",
     * "name": "",
     * "isHoliday": "是",
     * "holidayCategory": "星期六、星期日",
     * "description": ""
     *
     * "date": "2013/10/25",
     * "name": "臺灣光復節",
     * "isHoliday": "否",
     * "holidayCategory": "紀念日及節日",
     * "description": "本日照常上班。"
     */

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIsHoliday()
    {
        return isHoliday;
    }

    public void setIsHoliday(String isHoliday)
    {
        this.isHoliday = isHoliday;
    }

    public String getHolidayCategory()
    {
        return holidayCategory;
    }

    public void setHolidayCategory(String holidayCategory)
    {
        this.holidayCategory = holidayCategory;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "GovHolidayTO{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", isHoliday='" + isHoliday + '\'' +
                ", holidayCategory='" + holidayCategory + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
