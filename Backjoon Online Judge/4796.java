import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = -1, P = -1, V = -1;
        int testcase = 1;
        while (testcase > 0) {
            L = sc.nextInt();
            P = sc.nextInt();
            V = sc.nextInt();
            if (L == 0 && P == 0 && V == 0) {
                return;
            }
            System.out.println("Case " + testcase++ + ": " + findMaxCampingAvailable(L, P, V));
        }
    }

    static int findMaxCampingAvailable(int campAvailable, int totalDays, int vacation) {
        int totalAvailableDays = vacation / totalDays * campAvailable;
        totalAvailableDays += Math.min((vacation % totalDays), campAvailable);
        return Math.min(totalAvailableDays, vacation);
    }
}
 
