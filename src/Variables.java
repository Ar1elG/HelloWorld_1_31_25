public class Variables {
    public static void main(String [] args) {
        String name = "Ariel Guzman";
        int midterm = 32;
        int finalExam = 99;
        int average = (midterm+finalExam) / 2;

        System.out.println(name + " recieved an " + midterm + " and a " + finalExam + " for an average grade of " + average);

        if (average >= 60)
            System.out.println(name + " passed!");
        else
            System.out.println(name + " failed...");
    }
}
