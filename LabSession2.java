import java.util.Scanner;

public class LabSession2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = sc.next();

        System.out.print("Enter Department: ");
        String dept = sc.next();

        sc.close();

        String batchProcess = "No batch update performed.";
        if (args.length > 0) {
            batchProcess = "Batch Update Received:\n";
            for (int i = 0; i < args.length; i++) {
                batchProcess += "Arg " + (i + 1) + ": " + args[i] + "\n";
            }
        }

        System.out.println("\n===== Employee Information =====");
        System.out.println("Name       : " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department : " + dept);

        System.out.println("\n===== Batch Update Details =====");
        System.out.println(batchProcess);
    }
}
