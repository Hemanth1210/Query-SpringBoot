package com.example.project6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project6.model.project6;

public interface project6Repository extends JpaRepository<project6, Long> {

    @Query("select q from project6 q")
    List<project6> findAllData();
    
    @Query("select q from project6 q where q.active=false")
    List<project6> findAlldetail();

    @Query("select q from project6 q where q.active=:activeState and q.description in :descriptionList")
    List<project6> findData(@Param("activeState") Boolean activeState, @Param("descriptionList") List<String> descriptionList);
    


    @Modifying
    @Query("update project6 q set q.active = ?1 where q.id in ?2")
    int updateData(Boolean activeState, List<Long> idList);


}
