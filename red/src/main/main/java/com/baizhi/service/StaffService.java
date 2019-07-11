package com.baizhi.service;

import com.baizhi.entity.Staff;

import java.util.List;

public interface StaffService {
    public void insert(Staff staff);
    public List<Staff> selectAll(String departmentId);
    public void update(Staff staff);
    public void delete(String id);
    public Staff queryOne(String id);
}
