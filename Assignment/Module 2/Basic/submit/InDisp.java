import java.util.Scanner;

class Squad {
    private String name;
    private String id;
    private String[] techStack;

    Squad(String name, String id, String[] techStack) {
        this.name = name;
        this.id = id;
        this.techStack = techStack;
    }

    public void display() {
        System.out.println("==============================");
        System.out.println("   Developer's Profile");
        System.out.println("------------------------------");
        System.out.println("ID:   " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("------------------------------");
        System.out.println("Tech Stack:");

        for (String tech : techStack) {
            System.out.println("   - " + tech);
        }

        System.out.println("==============================");
    }

}

public class InDisp {
    public static void main(String[] args) {
        Squad s1 = input();
        s1.display();
    }

    public static Squad input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Developer Information ===");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            int n;
            do {
                System.out.print("Enter the number of technologies in your Tech Stack: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next(); 
                }
                n = sc.nextInt();
                sc.nextLine(); 
            } while (n < 0);

            System.out.println("Enter the technologies in your Tech Stack:");
            String[] techStack = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Tech " + (i + 1) + ": ");
                techStack[i] = sc.nextLine();
            }

            return new Squad(name, id, techStack);
        }
    }
}


// === Developer Information ===
// Enter name: Manoj
// Enter ID: EXEG6
// Enter the number of technologies in your Tech Stack: 5
// Enter the technologies in your Tech Stack:
// Tech 1: Java
// Tech 2: C++
// Tech 3: Python
// Tech 4: Machine Learning
// Tech 5: Node js
// ==============================
//    Developer's Profile
// ------------------------------
// ID:   EXEG6
// Name: Manoj
// ------------------------------
// Tech Stack:
//    - Java
//    - C++
//    - Python
//    - Machine Learning
//    - Node js
// ==============================