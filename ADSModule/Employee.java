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

    // Getter and Setter methods for the attributes
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
        // Create an ArrayList of Employee objects
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Initialize the list with sample employee records
        employeeList.add(new Employee(101, "John Doe", 50000, "HR", 30, "Manager"));
        employeeList.add(new Employee(102, "Jane Smith", 60000, "Finance", 35, "Accountant"));
        employeeList.add(new Employee(103, "Alice Johnson", 55000, "IT", 28, "Developer"));
        employeeList.add(new Employee(104, "Bob Wilson", 70000, "Marketing", 32, "Marketing Manager"));
        employeeList.add(new Employee(105, "Eve Brown", 52000, "HR", 27, "HR Specialist"));
        employeeList.add(new Employee(106, "Charlie Parker", 75000, "IT", 29, "Team Lead"));
        employeeList.add(new Employee(107, "Grace Allen", 68000, "Finance", 34, "Financial Analyst"));
        employeeList.add(new Employee(108, "David Davis", 56000, "Marketing", 31, "Marketing Coordinator"));

        // Q1: Print Records using For-Each Loop
        System.out.println("Q1: Employee Records using For-Each Loop");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Q2 and Q3: Sort by EmpAge (using Comparable)
        Collections.sort(employeeList);

        // Q4: After sort, Print Records using Iterator
        System.out.println("\nQ4: Sorted Employee Records by Age using Iterator");
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Q5: Sort employees by EmpDesig (using Comparator)
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpDesig().compareTo(emp2.getEmpDesig());
            }
        });

        System.out.println("\nQ5: Sorted Employee Records by Designation using For-Each Loop");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
