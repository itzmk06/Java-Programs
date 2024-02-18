import java.io.*;
import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ex2 {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nStudent Registration System Menu:");
                System.out.println("1. Register a Student");
                System.out.println("2. Perform Arithmetic Operation");
                System.out.println("3. Display Registered Students");
                System.out.println("4. Save Students to File");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        registerStudent(scanner);
                        break;
                    case 2:
                        performArithmeticOperation(scanner);
                        break;
                    case 3:
                        displayStudents();
                        break;
                    case 4:
                        saveStudentsToFile(scanner);
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("IO exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private static void registerStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        students.add(new Student(name, age));
        System.out.println("Student registered successfully.");
    }

    private static void performArithmeticOperation(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter arithmetic operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.nextLine();
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                result = num1 / num2;
                break;
            default:
                throw new ArithmeticException("Invalid arithmetic operation.");
        }

        System.out.println("Result: " + result);
    }

    private static void displayStudents() {
        System.out.println("\nRegistered Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }

    private static void saveStudentsToFile(Scanner scanner) throws IOException {
        String fileName = "student_list.txt";
        System.out.println("Saved to file successfully!");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("Students saved to file successfully.");
            System.out.println("Thanks for using! :)");
        }
    }
}
