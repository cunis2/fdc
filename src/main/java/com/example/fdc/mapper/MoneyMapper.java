package com.example.fdc.mapper;

import com.example.fdc.beans.Money;

public interface MoneyMapper {
    int insertMoney(Money money);  //插入一条财务信息
    int deleteMoneyByMid(Integer mid);  //根据财务号删除一条信息
    Money selectMoneyByMid(Integer mid); //根据财务好查财务信息
    int updateMoney(Money money);  //修改财务信息
}
