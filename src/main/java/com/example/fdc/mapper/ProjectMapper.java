package com.example.fdc.mapper;

import com.example.fdc.beans.Project;

public interface ProjectMapper {
    int insertProject(Project project);  //插入一个项目
    int updateProject(Project project);   //修改一个项目
    int deleteProjectByPid(Integer pid); //删除一个项目
    Project selectProjectByPid(Integer pid);  //根据项目号查信息
}
