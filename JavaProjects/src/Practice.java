public class Practice {
    public static void main(String[] args) {
        System.out.println(allowedToSit(1100));
        System.out.println("this line is from featuremayank");
        isEvenNumber(2);
        numberInRange(51);
        System.out.println("this line is added on line 6 from Mayank changed second time");
        System.out.println("this line is added on line 7 from Mayank changed second time");
        System.out.println("Kishan changed 1");
        System.out.println("just for testing *****");
        System.out.println("Mayank Patel");
        System.out.println("Mayank Patel *****");
        System.out.println("just for testing *****");
        System.out.println("this line is from featuremayank");
        System.out.println("Added another line of code");
    }
    public static void practice3(){
        System.out.println("Change2");
    }
    public static void isEvenNumber(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }
    System.out.println("this line is from featuremayank");
public static void practice(){
        System.out.println("Practice");
    }
    public static void numberInRange(int number) {
        if(number >= 50 && number <= 100) {
            System.out.println(number + " is within range");
        } else {
            System.out.println(number + " is not within range");
        }
    }

    public static boolean allowedToSit(int arrivalTime) {
        // arrive before 10am then allowed to sit
        boolean allowedToSit = false;
        if (arrivalTime <= 1000) {
            allowedToSit = true;
        }
        return allowedToSit;
    }
}