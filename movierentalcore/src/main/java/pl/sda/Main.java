package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/**
 * Created by RENT on 2017-01-24.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = "{\n" +
                "    \"creditCards\":[\n" +
                "        {\n" +
                "            \"number\":\"123\",\n" +
                "            \"money\":\"123323\",\n" +
                "            \"currency\":\"PLN\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"number\":\"234\",\n" +
                "            \"money\":\"234323\",\n" +
                "            \"currency\":\"USD\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"owner\":{\n" +
                "        \"name\":\"Adam Kowalski\",\n" +
                "        \"city\":\"Wroclaw\"\n" +
                "    },\n" +
                "    \"id\":\"1234\"\n" +
                "}";
        BankData bankData = objectMapper.readValue(json, BankData.class);
        System.out.println(bankData);


    }
}
