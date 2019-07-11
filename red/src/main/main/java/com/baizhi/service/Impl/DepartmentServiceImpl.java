package com.baizhi.service.Impl;

import com.baizhi.dao.DepartmentDao;
import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public boolean insert(Department department) {
        if(departmentDao.selectOnlyId(department.getId())!=null
                &&departmentDao.selectOnlyName(department.getName())!=null) {
            return false;
        }
        department.setId(UUID.randomUUID().toString());
        departmentDao.insert(department);
        return true;
    }

    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }

    @Override
    public List<Department> selectAll() {

        return departmentDao.selectAll();
    }

    @Override
    public Department selectById(String id) {
        return departmentDao.selectOnlyId(id);

    }
}
