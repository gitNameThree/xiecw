package com.zhrx;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest(classes = MybatisApplicationTests.class)
class MybatisApplicationTests {

    @Test
    void contextLoads() throws IOException{
        String url = "https://rzhtest.polars.info/auth/oauth/token?client_id=test_xiamen_MTEyNTc40Tk8MzMxNzg2NDQlMA==" +
                "&client_secret=7889fc4b-0940-467c-9523-8B16e052cd09&grant_type=client_credentials";
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpPost);
        String strRequest = "";
        if (null != closeableHttpResponse && !"".equals(closeableHttpResponse)) {
            System.out.println(closeableHttpResponse.getStatusLine().getStatusCode());
            if (closeableHttpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                org.apache.http.HttpEntity entity = closeableHttpResponse.getEntity();
//                return EntityUtils.toString(entity, "utf-8");s
            } else {
                strRequest = "Error Response" + closeableHttpResponse.getStatusLine().getStatusCode();
            }
        }
    }
    private String getToken() throws IOException {
        String url = "https://rzhtest.polars.info/auth/oauth/token?client_id=test_xiamen_MTEyNTc40Tk8MzMxNzg2NDQlMA==" +
                "&client_secret=7889fc4b-0940-467c-9523-8B16e052cd09&grant_type=client_credentials";
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(httpPost);
        String strRequest = "";
        if (null != closeableHttpResponse && !"".equals(closeableHttpResponse)) {
            System.out.println(closeableHttpResponse.getStatusLine().getStatusCode());
            if (closeableHttpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                org.apache.http.HttpEntity entity = closeableHttpResponse.getEntity();
                return EntityUtils.toString(entity, "utf-8");
            } else {
                strRequest = "Error Response" + closeableHttpResponse.getStatusLine().getStatusCode();
            }
        }
        return strRequest;
    }
}
