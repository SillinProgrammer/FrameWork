package com.baizhi.entity;

public class Staff {
    private String id;
    private String name;
    private double salary;
    private int age;
    private String departmentId;

    public Staff() {
    }

    public Staff(String id, String name, double salary, int age, String departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.departmentId = departmentId;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
