import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GRADE CHECKER 9000");

        System.out.print("Name? ");
        String name = scanner.next(); // NEXT reads in text (until the next blank or 'return' key) typed at the keyboard

        System.out.print("Midterm Grade? ");
        int midterm = scanner.nextInt();

        System.out.print("Final Grade? ");
        int finalExam = scanner.nextInt(); // NEXTiNT reads in an integer typed at the keyboard

        int average = (midterm+finalExam) / 2;

        System.out.println(name + " recieved an " + midterm + " and a " + finalExam + " for an average grade of " + average);

        if (average >= 60)
            System.out.println(name + " passed!");
        else
            System.out.println(name + " failed...");


    }
}