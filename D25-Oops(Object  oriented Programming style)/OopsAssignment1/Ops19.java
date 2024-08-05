//19) Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;
    int score;


    public Student(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public char getScoreCategory() {
        if (score >= 0 && score <= 50) {
            return 'A';
        } else if (score > 50 && score <= 65) {
            return 'B';
        } else if (score > 65 && score <= 80) {
            return 'C';
        } else if (score > 80 && score <= 100) {
            return 'D';
        } else {
            return ' ';
        }
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age + ", Score: " + score;
    }
}

public class Ops19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i <10; i++) {
            System.out.println("Enter details for Student " + (i+1 ) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); 

            students[i] = new Student(name, rollNo, age, score);
        }

        System.out.println("\nStudents grouped by score categories:");
        for (int i = 0; i < 4; i++) {
            char category = (char) ('A' + i);
            System.out.println("Category " + category + ":");
            for (Student student : students) {
                if (student.getScoreCategory() == category) {
                    System.out.println(student);
                }
            }
            System.out.println(); 
        }
    }
}
