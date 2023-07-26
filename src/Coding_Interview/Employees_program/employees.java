package Coding_Interview.Employees_program;
//I have a list of employees where Each attribute have age, name, salary
//    Task-1: We have to increase the salary of each employee by 10% whose age is
//    greater then 25
public class employees {
    int age;
    String name;
    int salary;

    public employees(String name,int age,int salary){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "employees{" +
                "salary=" + salary +
                '}';
    }
}
