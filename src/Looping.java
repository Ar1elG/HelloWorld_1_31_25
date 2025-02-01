import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to grade? ");
        int howMany = scanner.nextInt();

        for (int i = 1; i <= howMany; i = i + 1) { // Repeats the code in the loops body howMany times
            System.out.print("Name? ");
            String name = scanner.next();
            System.out.print("Midterm Grade? ");
            int midterm = scanner.nextInt();
            System.out.print("Final Grade? ");
            int finalExam = scanner.nextInt();
            int average = (midterm + finalExam) / 2;
            System.out.println(name + " recieved an " + midterm + " and a " + finalExam + " for an average grade of " + average);
            if (average >= 60)
                System.out.println(name + " passed!");
            else
                System.out.println(name + " failed...");

        }
    }
}