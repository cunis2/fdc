package com.example.fdc.mapper;

import com.example.fdc.beans.Perform;

public interface PerformMapper { //业绩功能
    int insertPerform(Perform perform);  //插入一条业绩
    int updatePerform(Perform perform);  //修改一条业绩
    int deletePerformByMid(Integer id);  //根据业绩id删除一条业绩
    Perform selectPerformByMid(Integer id);  //根据一个业绩id查一条业绩
}
