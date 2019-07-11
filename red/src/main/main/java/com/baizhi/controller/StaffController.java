package com.baizhi.controller;

import com.baizhi.entity.Department;
import com.baizhi.entity.Staff;
import com.baizhi.service.DepartmentService;
import com.baizhi.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/insert")
    public String insert(Staff staff){
        System.out.println("1111");
        staffService.insert(staff);
        return "redirect:/Department/showAll.do";
    }
    @RequestMapping("/queryById")
    public String queryById(String departmentId, Model model){
        List<Staff> sList = staffService.selectAll(departmentId);
        Department dt = departmentService.selectById(departmentId);
        model.addAttribute("department",dt);
        model.addAttribute("list",sList);
        return "emplist";
    }
    @RequestMapping("/delete")
    public String delete(String departmentId,String id){
        staffService.delete(id);
        return "forward:/Department/showAll.do?departmentId="+departmentId;
    }
    @RequestMapping("/updateStaff")
    public String updateStaff(String id,Model model){
        Staff s = staffService.queryOne(id);
        Department d =departmentService.selectById(s.getDepartmentId());
        List<Department> list = departmentService.selectAll();
        model.addAttribute("staff",s);
        model.addAttribute("department",d);
        model.addAttribute("list",list);
        return "updateEmp";
    }
}
