package com.example.fdc.beans;

import lombok.Data;

@Data
public class EmployeeBean {  //员工实体类
    Integer eid;      //工号
    String name;      //员工名
    String duty;      //职务
    String department;     //部门
    String type;          //类型
    Integer BMoney; //基础工资
    public Integer getBMoney() {
        return BMoney;
    }

    public void setBMoney(Integer bMoney) {
        BMoney = bMoney;
    }
    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
