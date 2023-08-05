package com.example.project6.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project6.model.project6;
import com.example.project6.repository.project6Repository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class project6Service {

    @Autowired
    project6Repository project6Repository;

    public List<project6> getTableDatas() {
        return project6Repository.findAllData();
    }
    
    public List<project6> getDetail(Boolean activeState, List<String> descriptionList){
        return project6Repository.findData(activeState, descriptionList);
    }

    public List<project6> getTableData() {
        return project6Repository.findAlldetail();
    }

    public int updateDatas(Boolean activeState, List<Long> idList) {
        return project6Repository.updateData(activeState, idList);
    }
}
