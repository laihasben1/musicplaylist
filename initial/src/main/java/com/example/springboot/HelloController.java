package com.example.springboot;

import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.File;  // Import the File class
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.LinkedList;


@RestController
public class HelloController {

    @GetMapping("/music")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/music/catalog")
    public Music[] getCatalog() throws IOException {
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read json file and convert to customer object
        Music[] musicObjects= objectMapper.readValue(new File("songList.json"), Music[].class);



        return musicObjects;
    }
}






