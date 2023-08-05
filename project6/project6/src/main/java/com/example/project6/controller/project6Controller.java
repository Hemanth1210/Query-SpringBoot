package com.example.project6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project6.model.project6;
import com.example.project6.service.project6Service;

@RestController
@RequestMapping("/api")

public class project6Controller {
    
    @Autowired
    project6Service project6Service;

    @GetMapping("/show_all")
    public List<project6> getDetails(){
        return project6Service.getTableDatas();
    }
    
    @GetMapping("/show_data")
    public List<project6> getDetail(){
        return project6Service.getTableData();
    }
    
    @GetMapping("/show_data/{activeState}/{descriptionList}")
    public List<project6> getData(@PathVariable Boolean activeState, @PathVariable List<String> descriptionList){
        return project6Service.getDetail(activeState, descriptionList);
    }

    @PutMapping("/updateData/{activeState}/{idList}")
    public int updateData(@PathVariable Boolean activeState, @PathVariable List<Long> idList){
        return project6Service.updateDatas(activeState, idList);
    }

}