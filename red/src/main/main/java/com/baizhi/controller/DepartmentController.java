package com.baizhi.controller;

import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/insert")
    public String insert(Department department){

        if(departmentService.insert(department)){
            return "redirect:/Department/showAll.do";
        }
        return "error";
    }
    @RequestMapping("/addEmp")
    public String addEmp(Model model){
       model.addAttribute("list", departmentService.selectAll());
       return "addEmp";
    }

    @RequestMapping("/update")
    public String update(Department department){
        System.out.println("deparment-update");
        departmentService.update(department);
        return "redirect:/Department/showAll.do";
    }
    @RequestMapping("/showAll")
    public String queryAll( Model model){
        List<Department> d_list=departmentService.selectAll();
        model.addAttribute("list",d_list);
        return "departments";
    }
    @RequestMapping("updateOne")
    public String updateOne(String departmentId,Model model){
        System.out.println("deparment-update-one");
        Department dt = departmentService.selectById(departmentId);
        System.out.println(dt);
        model.addAttribute("department",dt);
        return "updateDepartment";
    }
}
