/** Fictional employees and IDs, added for the portfolio demonstration. */
public class EmployeeDemo {
    public static void main(String[] args) {
        Employees company = new Employees();
        company.addEmployee(101, "DemoAlice", 3, 5000, "Engineering");
        company.addEmployee(102, "DemoBob", 7, 6500, "Engineering");
        System.out.println("Fictional employees");
        company.printAll();
        System.out.println("\nHighest salary in Engineering");
        company.printEmployee(company.findHighestSalary("Engineering"));
        int alice = company.findEmploye(101);
        System.out.println("\nCoursework bonus for DemoAlice: " + company.calculateBonus(alice));
        System.out.println("Synthetic records only; no real employee data.");
    }
}
