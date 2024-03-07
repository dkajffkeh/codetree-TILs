import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hallOfFame = "";
        String previousHallOfFame = "";
        int aStudentScore = 0;
        int bStudentScore = 0;

        int rounds = sc.nextInt();
        sc.nextLine(); // 소비
        int result = 0;

        for(int i = 1; i<= rounds; i ++) {

            // A 1 ...
            String input = sc.nextLine();
            String student = getStudentType(input);
            int score = getScore(input);

            if(student.equals("A")) aStudentScore += score;
            if(student.equals("B")) bStudentScore += score;

            if(aStudentScore > bStudentScore) hallOfFame = "A";

            if(bStudentScore > aStudentScore) hallOfFame = "B";

            if(aStudentScore == bStudentScore) hallOfFame = "AB";

            if(!hallOfFame.equals(previousHallOfFame)) {
                result++;
                previousHallOfFame = hallOfFame;
            }
        }

        System.out.println(result);
    }

    private static boolean isFirstRound(int i) {
        return i == 1;
    }

    private static String getStudentType(String input) {
        return input.split(" ")[0];
    }

    private static int getScore(String input) {
        return Integer.parseInt(input.split(" ")[1]);
    }
}