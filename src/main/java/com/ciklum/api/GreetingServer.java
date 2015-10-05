package com.ciklum.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by skn on 02/10/2015.
 */
@SpringBootApplication
@RestController
public class GreetingServer {

    private ServerSocket serverSocket;

    public GreetingServer() throws IOException {
    }

    public static void main (String [] args){
        SpringApplication app = new SpringApplication(GreetingServer.class);
        app.setShowBanner(true);
        app.run(args);
//        SpringApplication.run(GreetingServer.class, args);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody String home(){
        return "Hello world!";
    }

}
