import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private float empSalary;
    private String empDept;
    private int empAge;
    private String empDesig;

    public Employee(int empId, String empName, float empSalary, String empDept, int empAge, String empDesig) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDept = empDept;
        this.empAge = empAge;
        this.empDesig = empDesig;
    }

  
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpDesig() {
        return empDesig;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empAge, other.empAge);
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId +
               "\nName: " + empName +
               "\nSalary: " + empSalary +
               "\nDepartment: " + empDept +
               "\nAge: " + empAge +
               "\nDesignation: " + empDesig + "\n";
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        
        ArrayList<Employee> employeeList = new ArrayList<>();

        
        employeeList.add(new Employee(101, "Alisha", 50000, "HR", 30, "Manager"));
        employeeList.add(new Employee(102, "Abhishek", 60000, "Finance", 35, "Accountant"));
        employeeList.add(new Employee(103, "Akshay", 55000, "IT", 28, "Developer"));
        employeeList.add(new Employee(104, "Arpita", 70000, "Marketing", 32, "Marketing Manager"));
        employeeList.add(new Employee(105, "Aniket", 52000, "HR", 27, "HR Specialist"));
        employeeList.add(new Employee(106, "Aishwarya", 75000, "IT", 29, "Team Lead"));
        employeeList.add(new Employee(107, "Ankita", 68000, "Finance", 34, "Financial Analyst"));
        employeeList.add(new Employee(108, "Aditya", 56000, "Marketing", 31, "Marketing Coordinator"));

      
        System.out.println("Employee Records using For-Each Loop");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        
        Collections.sort(employeeList);

        
        System.out.println("Sorted Employee Records by Age using Iterator");
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpDesig().compareTo(emp2.getEmpDesig());
            }
        });

        System.out.println("Sorted Employee Records by Designation using For-Each Loop");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
