package com.wei.example.common.to;

public class ApiRespTO {
    private Integer statusCode;
    private String responseContent;

    public ApiRespTO(){}

    public ApiRespTO(Integer statusCode, String content){
        this.statusCode = statusCode;
        this.responseContent = content;
    }

    public Integer getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getResponseContent()
    {
        return responseContent;
    }

    public void setResponseContent(String responseContent)
    {
        this.responseContent = responseContent;
    }

    @Override
    public String toString()
    {
        return "ApiRespTO{" +
                "statusCode=" + statusCode +
                ", responseContent='" + responseContent + '\'' +
                '}';
    }
}
