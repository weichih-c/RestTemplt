package com.wei.example.common.util;

import com.wei.example.common.to.ApiRespTO;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class RestUtil {

    public static ApiRespTO executeGet(String url) throws IOException, URISyntaxException
    {
        CloseableHttpClient httpClient = generateHttpClient();
        HttpGet httpGet = new HttpGet(url);
        return executeHttpRequest(httpClient, httpGet);
    }

    public static ApiRespTO executePostJson(String url, Map<String, String> payloads) throws IOException, URISyntaxException
    {
        CloseableHttpClient httpClient = generateHttpClient();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");

        JSONObject jsonObject = new JSONObject();
        for ( Map.Entry<String, String> entry: payloads.entrySet() ){
            jsonObject.put(entry.getKey(), entry.getValue());
        }
        HttpEntity stringEntity = new StringEntity(jsonObject.toString(), ContentType.APPLICATION_JSON);
        httpPost.setEntity(stringEntity);
        return executeHttpRequest(httpClient, httpPost);
    }

    private static CloseableHttpClient generateHttpClient(){
        return HttpClients.custom()
        .setSSLHostnameVerifier(new NoopHostnameVerifier())
        .build();
    }

    private static ApiRespTO executeHttpRequest(CloseableHttpClient httpClient, HttpUriRequest request) throws IOException
    {
        CloseableHttpResponse response = httpClient.execute( request );
        String responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
        ApiRespTO apiResp = new ApiRespTO(response.getStatusLine().getStatusCode(), responseBody);
        httpClient.close();
        response.close();
        return apiResp;
    }


}
