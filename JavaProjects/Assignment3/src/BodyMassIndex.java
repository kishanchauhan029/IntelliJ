import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.println(getHeightAndWeight());
    }

    public static float getHeightAndWeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Height:");
        float weight = (float) scanner.nextDouble();
        System.out.println("Your Weight:");
        float height = scanner.nextFloat();
        System.out.println("Your BMI is:" + weight/(height*height));
        System.out.println("Git Test Done!");
        return weight/(height*height);
    }
}
