package com.example.fdc.beans;

import lombok.Data;

@Data
public class Perform {      //绩效类实体
    Integer id;  //业绩id
    Integer eid;  //工号
    Integer pid;  //项目号
    Integer decide;  //评分

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDecide() {
        return decide;
    }

    public void setDecide(Integer decide) {
        this.decide = decide;
    }
}
