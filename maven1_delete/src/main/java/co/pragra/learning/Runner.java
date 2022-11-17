package co.pragra.learning;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneChecker phoneChecker = new PhoneChecker();
        System.out.println("Key In Phone");
        String phone = scanner.nextLine();
        String out = phoneChecker.testPhone(phone)?"Valid Phone":"Invalid Phone";
        System.out.println(out);
    }
}
