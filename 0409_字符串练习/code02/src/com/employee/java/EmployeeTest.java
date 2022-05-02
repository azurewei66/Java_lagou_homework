package com.employee.java;

/**
 * @author wei
 * @date 2021/4/11 - 18:18
 * @project_name code02
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        //    public Employee(String n,double s,int year,int mouth,int day)
        staff[0] = new Employee("Alin",7000,2021,04,07);
        staff[1] = new Employee("Bob",8000,2021,05,07);
        staff[2] = new Employee("Charli",9000,2021,06,07);

        System.out.println("before raise salary");
        for(Employee e:staff)
            System.out.println("name= " + e.getName() + " salary= " + e.getSalary()
            + " hireday= " + e.getHireday());

        System.out.println("after raise salary");

        for (Employee e:staff) {
            e.raiseSalary(Math.random());
        }
        for(Employee e:staff){
//            String hireday = (String) e.getHireday();
            System.out.printf("name= %s,salary= %3.2f,hireday= %d-%d-%d\n",e.getName(),e.getSalary(),
                    e.getHireday().getYear(),e.getHireday().getMonthValue(),e.getHireday().getDayOfMonth());
        }
    }
}
