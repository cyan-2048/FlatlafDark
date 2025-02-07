package javaapplication;

import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"Math", "Science", "English", "Aral. Pan.", "P.E."};
        double[][] grades = new double[3][5];

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 5; j++) {
                double grade;

                while (true) {
                    System.out.print("Enter grade for " + subjects[j] + ": ");
                    grade = scanner.nextDouble();
                    if (grade >= 0 && grade <= 100) {
                        break;
                    }
                    System.out.println("Please enter a valid grade (0-100)!");
                }

                grades[i][j] = grade;
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            double totalScores = 0;
            for (int j = 0; j < 5; j++) {
                totalScores += grades[i][j];
            }

            // two decimal places
            double rounded = Math.round((totalScores / 5) * 100.0) / 100.0;
            System.out.println("Student " + (i + 1) + " Average: " + rounded);
        }

    }

}
