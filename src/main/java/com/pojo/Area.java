package com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class Area {

    Integer areaId;

    String areaName;

    public Area(Integer areaId, String areaName) {
        this.areaId = areaId;
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
