package com.baizhi.dao;

import com.baizhi.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentDao {
    public void insert( Department department);
    public void update(Department department);
    public List<Department> selectAll();
    public Department selectOnlyId(@Param("id")String id);
    public Department selectOnlyName(@Param("name")String name);
}
