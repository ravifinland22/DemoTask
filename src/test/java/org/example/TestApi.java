package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.example.api.Mapper;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestApi {

    private CloseableHttpClient client;
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        client = HttpClients.createDefault();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testGet() throws IOException {
        Mapper mapper = null;
        try {
            HttpGet httpGet = new HttpGet("https://catfact.ninja/breeds");
            httpGet.addHeader("content-type", "application/json");
            CloseableHttpResponse response = client.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200) {
                String responseValue = EntityUtils.toString(response.getEntity());
                //Checking the response
                System.out.println(responseValue);
                mapper = objectMapper.readValue(responseValue, Mapper.class);
            }
            if (mapper.getData().isArray()) {
                for (JsonNode node : mapper.getData()) {
                    //print all the breed names to console
                    System.out.println(node.get("breed").toString());
                }
            }
        } finally {
            client.close();
        }
    }

    @Test
    public void testPost() throws IOException {
        HttpPost httpPost = new HttpPost("http://dummy.restapiexample.com/api/v1/create");
        String json = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
        try {
            StringEntity entity = new StringEntity(json);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = client.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                String responseValue = EntityUtils.toString(response.getEntity());
                //Checking the response
                System.out.println(responseValue);
            }
        } finally {
            client.close();
        }
    }

}
