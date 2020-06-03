package com.restapi.dynamiccontent.restapidynamiccontent;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.regex.*;


@RestController
public class VideoPresenterController {

    @RequestMapping(method = RequestMethod.GET, path = "/getVideos/{name}")
    public String getVideos(@PathVariable ("name") String name){

        switch (name){
            case "python":
                return String.format(" This is all ur Python videos");

            case "java":
                return String.format(" This is all ur Java videos");

            default:
                return String.format(" Sorry, incorrect input");

        }


    }
}
