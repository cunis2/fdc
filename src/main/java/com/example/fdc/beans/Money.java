package com.example.fdc.beans;

import lombok.Data;

@Data
public class Money {
    Integer mid;      //财务id
    Integer id;     //对应业绩表的id
    Integer money;  //绩效工资

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }




}
