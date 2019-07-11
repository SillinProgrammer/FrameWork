package com.baizhi.service;

import com.baizhi.entity.Department;

import java.util.List;

public interface DepartmentService {
    public boolean insert(Department department);
    public void update(Department department);
    public List<Department> selectAll();
    public Department selectById(String id);
}
