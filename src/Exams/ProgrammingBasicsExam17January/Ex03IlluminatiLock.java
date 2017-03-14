package Exams.ProgrammingBasicsExam17January;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/149#2
 */
public class Ex03IlluminatiLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String sideDots = repeatStr(".", n);
        String midDots = "";
        String centerDots = repeatStr(".", n - 2);

        String lineStartEnd = sideDots + repeatStr("#", n) + sideDots;

        System.out.println(lineStartEnd);

        for (int i = 1; i < n; i++) {
            if (i <= n / 2) {
                int numSideDots = n - 2 * i;
                sideDots = repeatStr(".", numSideDots);
                midDots = repeatStr(".", n - numSideDots - 2);
            } else if (i > n / 2 + 1) {
                int numSideDots = 2 * i - n;
                sideDots = repeatStr(".", 2 * i - n);
                midDots = repeatStr(".", n - numSideDots - 2);
            }

            System.out.println(sideDots + "##" + midDots + "#" + centerDots + "#" + midDots + "##" + sideDots);
        }

        System.out.println(lineStartEnd);
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
