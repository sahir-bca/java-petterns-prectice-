package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class sms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> rollNumbers = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter student roll number: ");
                    int rollnumber = sc.nextInt();

                    boolean exists = false;

                    for (int i = 0; i < rollNumbers.size(); i++) {
                        if (rollNumbers.get(i) == rollnumber) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Roll number already exists!");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String studentname = sc.nextLine();

                    rollNumbers.add(rollnumber);
                    studentNames.add(studentname);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (rollNumbers.isEmpty()) {
                        System.out.println("No students available.");
                        break;
                    }

                    System.out.println("\n--- Student List ---");

                    for (int i = 0; i < rollNumbers.size(); i++) {
                        System.out.println("Roll Number: " + rollNumbers.get(i));
                        System.out.println("Name: " + studentNames.get(i));
                        System.out.println("-------------------");
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < rollNumbers.size(); i++) {

                        if (rollNumbers.get(i) == searchRoll) {
                            System.out.println("Student found!");
                            System.out.println("Roll Number: " + rollNumbers.get(i));
                            System.out.println("Name: " + studentNames.get(i));

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < rollNumbers.size(); i++) {

                        if (rollNumbers.get(i) == deleteRoll) {

                            rollNumbers.remove(i);
                            studentNames.remove(i);

                            System.out.println("Student deleted successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter roll number to update: ");
                    int updateRoll = sc.nextInt();

                    found = false;

                    for (int i = 0; i < rollNumbers.size(); i++) {

                        if (rollNumbers.get(i) == updateRoll) {

                            sc.nextLine();

                            System.out.print("Enter new student name: ");
                            String newName = sc.nextLine();

                            studentNames.set(i, newName);

                            System.out.println("Student updated successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}