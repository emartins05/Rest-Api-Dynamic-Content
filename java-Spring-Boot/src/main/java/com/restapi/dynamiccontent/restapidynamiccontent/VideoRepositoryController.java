package com.restapi.dynamiccontent.restapidynamiccontent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideoRepositoryController {

    @Autowired
    VideoRepository videoRepository;

    public List<Videos> getAllVideos(){

        return videoRepository.findAll();
    }


}
