package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Controller {


//    GET /name : returns “My name is .......”
//            - GET /age : returns “My age is ........”
//            - GET /check/status : returns “Everything OK”
//            - GET /health : returns “Server health is up and running”
//            - Get /names :
//            return array of names



    @GetMapping("/age")
    public String age() {
        return "My age is 24";
    }

    @GetMapping("/check/status")
    public String everythingOK() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public ArrayList<String> names() {
        ArrayList<String> names = new ArrayList<>();

        names.add("hussam");
        names.add("mohammed");
        names.add("abdulaziz");
        return names;
    }
}












