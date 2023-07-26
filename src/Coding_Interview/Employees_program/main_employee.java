package Coding_Interview.Employees_program;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class main_employee {
    public static void main(String[] args) {
        List<employees> employeeList = new LinkedList<>();
        employees e1 = new employees("a",21,1000);
        employees e2 = new employees("b",23,12000);
        employees e3 = new employees("c",27,15000);
        employees e4 = new employees("d",26,16000);
        employees e5 = new employees("e",24,19000);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
//stream is the sequence of object
        System.out.println("original salary : ");
        System.out.println(employeeList);
       List<employees> incremented  =employeeList.stream().peek(e->{
            if(e.getAge()>25){
                e.setSalary((int) (e.getSalary()*1.10));
            }
       }).collect(Collectors.toList());
        System.out.println("Incremented salary: ");
        System.out.println(incremented);
    }

}
