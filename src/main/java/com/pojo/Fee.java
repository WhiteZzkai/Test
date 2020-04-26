package com.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Fee {

    Integer feeId;

    Integer houseNum;

    String  houseUser;

    Date feeDay;

    Integer areaId;

    Integer channelId;

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public Integer getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public String getHouseUser() {
        return houseUser;
    }

    public void setHouseUser(String houseUser) {
        this.houseUser = houseUser;
    }

    public Date getFeeDay() {
        return feeDay;
    }

    public void setFeeDay(Date feeDay) {
        this.feeDay = feeDay;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "feeId=" + feeId +
                ", houseNum=" + houseNum +
                ", houseUser='" + houseUser + '\'' +
                ", feeDay=" + feeDay +
                ", areaId=" + areaId +
                ", channelId=" + channelId +
                '}';
    }
}
