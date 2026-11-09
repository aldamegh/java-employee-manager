import java.io.*;
public class EmployeeTest {
    private static int checks;

    private static void check(boolean condition, String message) {
        checks++;
        if (!condition) throw new AssertionError(message);
    }

    public static void main(String[] args) {
        Employees employees = new Employees();
        check(employees.addEmployee(1, "Alex", 2, 500, "IT") == 1, "Add employee");
        check(employees.addEmployee(2, "Taylor", 7, 200, "it") == 1, "Add lower-paid employee last");
        check(employees.findHighestSalary("IT") == 0, "Find true maximum, not last employee");
        check(employees.findHighestSalary("Missing") == -1, "Missing department");
        check(employees.addEmployee(1, "Other", 1, 100, "IT") == -1, "Duplicate employee ID");
        check(employees.calculateBonus(0) == 1000, "Early-career bonus");
        check(employees.calculateBonus(1) == 600, "Mid-career bonus");
        check(employees.calculateBonus(-1) == -1, "Invalid bonus index");
        check(employees.addEmployee(3, "Casey", 11, 100, "HR") == 1, "Add senior employee");
        check(employees.calculateBonus(2) == 400, "Senior bonus");
        check(employees.addEmployee(4, "Invalid", -1, 10, "HR") == -3, "Reject invalid years");
        check(employees.getNEmployees() == 3, "Rejected writes preserve count");
        System.out.println(checks + " checks passed.");
    }
}
