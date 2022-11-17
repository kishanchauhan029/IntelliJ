import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.nextLine();

        scanner.close();
    }
}
