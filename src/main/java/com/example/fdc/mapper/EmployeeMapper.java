package com.example.fdc.mapper;

import com.example.fdc.beans.EmployeeBean;

public interface EmployeeMapper {
    int insertEmployee(EmployeeBean employeeBean); //插入员工信息
    int deleteEmployeeByEid(Integer eid);   //根据工号删除员工
    EmployeeBean selectEmployeeByEid(Integer eid); //根据工号查员工
    int updateEmployee(EmployeeBean employeeBean); //改员工信息
}
