package com.example.fdc.mapper;

import com.example.fdc.beans.ClientBean;

public interface ClientMapper {
    int insertClient(ClientBean clientBean);   //插入客户
    int updateClient(ClientBean clientBean);   //修改客户
    ClientBean selectClientByCid(Integer cid);     //根据客户编号查客户
    int deleteClientByCid(Integer cid);          //根据客户编号删除客户
}
