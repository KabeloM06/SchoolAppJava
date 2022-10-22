package util;

import java.util.Scanner;

public class InputUtil {
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }
    public static String enterString(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public static void main(String[] args) {

    }
}
