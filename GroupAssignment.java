package lab9;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        String group;
        switch (rollNumber % 4) {
            case 1:
                group = "Sapphire";
                break;
            case 2:
                group = "Perl";
                break;
            case 3:
                group = "Ruby";
                break;
            case 0:
                group = "Emerald";
                break;
            default:
                group = "Unknown";
        }

        System.out.println("Group: " + group);
        scanner.close();
    }
}
