package com.baizhi.service.Impl;

import com.baizhi.dao.StaffDao;
import com.baizhi.entity.Staff;
import com.baizhi.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service("staffService")
@Transactional
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public void insert(Staff staff) {
        staff.setId(UUID.randomUUID().toString());
        staffDao.insert(staff);
    }

    @Override
    public List<Staff> selectAll(String departmentId) {
        return staffDao.selectByDepartmentId(departmentId);
    }

    @Override
    public void update(Staff staff) {
        staffDao.update(staff);
    }

    @Override
    public void delete(String id) {
        staffDao.delete(id);
    }

    @Override
    public Staff queryOne(String id) {

        return staffDao.queryOne(id);
    }
}
