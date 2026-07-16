import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        // Employee data arrays
        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        // Get empid from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        boolean found = false;

        // Search for the employee id in the array
        for (int i = 0; i < empNo.length; i++) {

            if (empNo[i] == empId) {
                found = true;

                String designation = "";
                int da = 0;

                // Switch case to find Designation and DA
                switch (designationCode[i]) {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                }

                // Salary calculation
                int salary = basic[i] + hra[i] + da - it[i];

                // Print the output
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empNo[i] + "\t" + empName[i] + "\t\t" + department[i] + "\t\t" + designation + "\t" + salary);

                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}