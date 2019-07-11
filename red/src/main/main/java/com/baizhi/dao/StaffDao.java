package com.baizhi.dao;

import com.baizhi.entity.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {
    public void insert(Staff staff);
    public List<Staff> selectByDepartmentId(@Param("departmentId") String departmentId);
    public void update( Staff staff);
    public void delete(@Param("id") String id);
    public Staff queryOne(@Param("id") String id);
}
