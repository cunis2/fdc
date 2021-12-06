package com.example.fdc.beans;

import lombok.Data;

@Data
public class Project {
    String PName;      //项目名称
    Integer pid;       //项目Id
    Integer cid;      //客户Id
    String dataUrl;    //项目保存地址
    String state;     //项目完成状态
    Integer price;    //项目总价
    String MPrinciple;    //模型主管
    String APrinciple;   //渲染主管
    String LPrinciple;   //后期主管
    Data BTime;    //开始时间
    Data ETime;   //结束时间
    String type;  //项目类型

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMPrinciple() {
        return MPrinciple;
    }

    public void setMPrinciple(String MPrinciple) {
        this.MPrinciple = MPrinciple;
    }

    public String getAPrinciple() {
        return APrinciple;
    }

    public void setAPrinciple(String APrinciple) {
        this.APrinciple = APrinciple;
    }

    public String getLPrinciple() {
        return LPrinciple;
    }

    public void setLPrinciple(String LPrinciple) {
        this.LPrinciple = LPrinciple;
    }

    public Data getBTime() {
        return BTime;
    }

    public void setBTime(Data BTime) {
        this.BTime = BTime;
    }

    public Data getETime() {
        return ETime;
    }

    public void setETime(Data ETime) {
        this.ETime = ETime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
