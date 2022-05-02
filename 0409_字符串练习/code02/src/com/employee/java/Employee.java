package com.employee.java;

import java.time.LocalDate;

/**
 * @author wei
 * @date 2021/4/11 - 18:40
 * @project_name code02
 */
public class Employee {
    //instance fields
    private String name ;
    private double salary;
    private LocalDate hireday;

    //constructor
    public Employee(String n,double s,int year,int mouth,int day){
        name = n;
        salary = s;
        hireday = LocalDate.of(year,mouth,day);
    }

    //method
    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireday(){
        return hireday;
    }

    public void raiseSalary(double ByPercent){
        double raise = ByPercent * salary;
        salary += raise;
    }
}
