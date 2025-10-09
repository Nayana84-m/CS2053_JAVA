import java.util.Scanner;

class Employee {
    String name;
    String id;
    String department;
    String location;

    // Constructor
    Employee(String name, String id) {
        this.name = name;
        this.id = id;
        this.department = "Not Assigned";
        this.location = "Not Assigned";
    }

    // Method to update department and location
    void updateDetails(String department, String location) {
        this.department = department;
        this.location = location;
    }

    // Display employee info
    void displayInfo() {
        System.out.println("\nEmployee Info:");
        System.out.println("Name      : " + name);
        System.out.println("ID        : " + id);
        System.out.println("Department: " + department);
        System.out.println("Location  : " + location);
    }
}

public class HRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        // Create employee object
        Employee emp = new Employee(name, id);

        // Check command-line arguments for batch update
        if (args.length >= 2) {
            String dept = args[0];
            String loc = args[1];
            emp.updateDetails(dept, loc);
        }

        // Display final info
        emp.displayInfo();

        sc.close();
    }
}